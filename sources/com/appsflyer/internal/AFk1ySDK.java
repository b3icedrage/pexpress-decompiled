package com.appsflyer.internal;

import com.google.android.gms.common.api.Api;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class AFk1ySDK extends FilterInputStream {
    private final int AFKeystoreWrapper;
    private final int AFLogger;
    private int afInfoLog;
    private final int d;
    private int e;
    private long[] force;
    private byte[] i;
    private int registerClient;
    private long[] unregisterClient;
    private short v;
    private int w;

    public AFk1ySDK(InputStream inputStream, int i, int i2, short s, int i3, int i4) {
        this(inputStream, i, i2, s, i3, i4, (byte) 0);
    }

    private int AFKeystoreWrapper() throws IOException {
        int i;
        if (this.e == Integer.MAX_VALUE) {
            this.e = ((FilterInputStream) this).in.read();
        }
        if (this.w == this.AFKeystoreWrapper) {
            byte[] bArr = this.i;
            int i2 = this.e;
            bArr[0] = (byte) i2;
            if (i2 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i3 = 1;
            do {
                int i4 = ((FilterInputStream) this).in.read(this.i, i3, this.AFKeystoreWrapper - i3);
                if (i4 <= 0) {
                    break;
                }
                i3 += i4;
            } while (i3 < this.AFKeystoreWrapper);
            if (i3 < this.AFKeystoreWrapper) {
                throw new IllegalStateException("unexpected block size");
            }
            int i5 = this.AFLogger;
            if (i5 == this.d) {
                unregisterClient();
            } else {
                if (this.registerClient <= i5) {
                    unregisterClient();
                }
                int i6 = this.registerClient;
                if (i6 < this.d) {
                    this.registerClient = i6 + 1;
                } else {
                    this.registerClient = 1;
                }
            }
            int i7 = ((FilterInputStream) this).in.read();
            this.e = i7;
            this.w = 0;
            if (i7 < 0) {
                int i8 = this.AFKeystoreWrapper;
                i = i8 - (this.i[i8 - 1] & 255);
            } else {
                i = this.AFKeystoreWrapper;
            }
            this.afInfoLog = i;
        }
        return this.afInfoLog;
    }

    private void unregisterClient() {
        long[] jArr = this.unregisterClient;
        long[] jArr2 = this.force;
        short s = this.v;
        long j = jArr[s % 4] * 2147483085;
        long j2 = jArr2[(s + 2) % 4];
        int i = (s + 3) % 4;
        jArr2[i] = ((jArr[i] * 2147483085) + j2) / 2147483647L;
        jArr[i] = (j + j2) % 2147483647L;
        for (int i2 = 0; i2 < this.AFKeystoreWrapper; i2++) {
            byte[] bArr = this.i;
            bArr[i2] = (byte) (((long) bArr[i2]) ^ ((this.unregisterClient[this.v] >> (i2 << 3)) & 255));
        }
        this.v = (short) ((this.v + 1) % 4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        AFKeystoreWrapper();
        return this.afInfoLog - this.w;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        AFKeystoreWrapper();
        int i = this.w;
        if (i >= this.afInfoLog) {
            return -1;
        }
        byte[] bArr = this.i;
        this.w = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    private AFk1ySDK(InputStream inputStream, int i, int i2, short s, int i3, int i4, byte b) {
        super(new BufferedInputStream(inputStream, 4096));
        this.registerClient = 1;
        this.e = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int iMin = Math.min(Math.max((int) s, 4), 8);
        this.AFKeystoreWrapper = iMin;
        this.i = new byte[iMin];
        this.unregisterClient = new long[4];
        this.force = new long[4];
        this.w = iMin;
        this.afInfoLog = iMin;
        this.unregisterClient = AFk1wSDK.AFKeystoreWrapper(i ^ i4, iMin ^ i4);
        this.force = AFk1wSDK.AFKeystoreWrapper(i2 ^ i4, i3 ^ i4);
        this.AFLogger = 100;
        this.d = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            AFKeystoreWrapper();
            int i5 = this.w;
            if (i5 >= this.afInfoLog) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.i;
            this.w = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }
}
