package com.appsflyer.internal;

import com.google.android.gms.common.api.Api;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1aSDK extends FilterInputStream {
    private static final short registerClient = (short) (Math.pow(2.0d, 15.0d) * (Math.sqrt(5.0d) - 1.0d));
    private byte[] AFKeystoreWrapper;
    private byte[] AFLogger;
    private int AFLoggerLogLevel;
    private final int afDebugLog;
    private final int afErrorLog;
    private int afInfoLog;
    private int afWarnLog;
    private byte[] d;
    private int e;
    private int force;
    private int getEntries;
    private int i;
    private int unregisterClient;
    private int v;
    private int w;

    public AFj1aSDK(InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3) {
        this(inputStream, iArr, i, bArr, i2, i3, (byte) 0);
    }

    private int AFKeystoreWrapper() throws IOException {
        if (this.force == Integer.MAX_VALUE) {
            this.force = ((FilterInputStream) this).in.read();
        }
        if (this.unregisterClient == 8) {
            byte[] bArr = this.AFLogger;
            int i = this.force;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int i3 = ((FilterInputStream) this).in.read(this.AFLogger, i2, 8 - i2);
                if (i3 <= 0) {
                    break;
                }
                i2 += i3;
            } while (i2 < 8);
            if (i2 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            int i4 = this.afErrorLog;
            if (i4 == this.afDebugLog) {
                unregisterClient();
            } else {
                if (this.getEntries <= i4) {
                    unregisterClient();
                }
                int i5 = this.getEntries;
                if (i5 < this.afDebugLog) {
                    this.getEntries = i5 + 1;
                } else {
                    this.getEntries = 1;
                }
            }
            int i6 = ((FilterInputStream) this).in.read();
            this.force = i6;
            this.unregisterClient = 0;
            this.w = i6 < 0 ? 8 - (this.AFLogger[7] & 255) : 8;
        }
        return this.w;
    }

    private void unregisterClient() {
        if (this.i == 3) {
            byte[] bArr = this.AFLogger;
            System.arraycopy(bArr, 0, this.d, 0, bArr.length);
        }
        byte[] bArr2 = this.AFLogger;
        boolean z = true;
        char c = 2;
        int i = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i2 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i3 = 0;
        while (true) {
            int i4 = this.v;
            if (i3 >= i4) {
                break;
            }
            short s = registerClient;
            i2 -= ((((i4 - i3) * s) + i) ^ ((i << 4) + this.afInfoLog)) ^ ((i >>> 5) + this.afWarnLog);
            i -= (((i2 << 4) + this.e) ^ (((i4 - i3) * s) + i2)) ^ ((i2 >>> 5) + this.AFLoggerLogLevel);
            i3++;
            c = c;
            z = z;
        }
        byte[] bArr3 = this.AFLogger;
        bArr3[0] = (byte) (i >> 24);
        bArr3[z ? 1 : 0] = (byte) (i >> 16);
        bArr3[c] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.i == 3) {
            for (int i5 = 0; i5 < 8; i5++) {
                byte[] bArr4 = this.AFLogger;
                bArr4[i5] = (byte) (bArr4[i5] ^ this.AFKeystoreWrapper[i5]);
            }
            byte[] bArr5 = this.d;
            System.arraycopy(bArr5, 0, this.AFKeystoreWrapper, 0, bArr5.length);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        AFKeystoreWrapper();
        return this.w - this.unregisterClient;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        AFKeystoreWrapper();
        int i = this.unregisterClient;
        if (i >= this.w) {
            return -1;
        }
        byte[] bArr = this.AFLogger;
        this.unregisterClient = i + 1;
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

    private AFj1aSDK(InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3, byte b) {
        super(new BufferedInputStream(inputStream, 4096));
        this.force = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.getEntries = 1;
        this.AFLogger = new byte[8];
        this.AFKeystoreWrapper = new byte[8];
        this.d = new byte[8];
        this.unregisterClient = 8;
        this.w = 8;
        this.v = Math.min(Math.max(i2, 5), 16);
        this.i = i3;
        if (i3 == 3) {
            System.arraycopy(bArr, 0, this.AFKeystoreWrapper, 0, 8);
        }
        long j = (((long) iArr[1]) & 4294967295L) | ((((long) iArr[0]) & 4294967295L) << 32);
        if (i == 0) {
            this.e = (int) j;
            long j2 = j >> 3;
            short s = registerClient;
            this.AFLoggerLogLevel = (int) ((((long) s) * j2) >> 32);
            this.afInfoLog = (int) (j >> 32);
            this.afWarnLog = (int) (j2 + ((long) s));
        } else {
            int i4 = (int) j;
            this.e = i4;
            this.AFLoggerLogLevel = i4 * i;
            this.afInfoLog = i ^ i4;
            this.afWarnLog = (int) (j >> 32);
        }
        this.afErrorLog = 100;
        this.afDebugLog = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            AFKeystoreWrapper();
            int i5 = this.unregisterClient;
            if (i5 >= this.w) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.AFLogger;
            this.unregisterClient = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }
}
