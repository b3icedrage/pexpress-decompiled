package io.sentry.util;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements Serializable {
    public static final AtomicLong g = new AtomicLong(System.nanoTime());
    public long d;
    public final long e;

    public t() {
        long jA = a();
        long jA2 = (a() << 1) | 1;
        this.e = jA2;
        this.d = jA2 + jA;
    }

    public static long a() {
        AtomicLong atomicLong;
        long j;
        long j2;
        do {
            atomicLong = g;
            j = atomicLong.get();
            long j3 = (j >> 12) ^ j;
            long j4 = j3 ^ (j3 << 25);
            j2 = (j4 ^ (j4 >> 27)) * 2685821657736338717L;
        } while (!atomicLong.compareAndSet(j, j2));
        return j2;
    }

    public final void b(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            long j = (this.d * 6364136223846793005L) + this.e;
            this.d = j;
            bArr[i] = (byte) ((((j >>> 22) ^ j) >>> ((int) ((j >>> 61) + 22))) >>> 24);
        }
    }

    public final double c() {
        long j = this.d * 6364136223846793005L;
        long j2 = this.e;
        long j3 = j + j2;
        long j4 = (((j3 >>> 22) ^ j3) >>> ((int) ((j3 >>> 61) + 22))) & 4294967295L;
        long j5 = (j3 * 6364136223846793005L) + j2;
        this.d = j5;
        return (((j4 >>> 6) << 27) + (((((j5 >>> 22) ^ j5) >>> ((int) ((j5 >>> 61) + 22))) & 4294967295L) >>> 5)) / 9.007199254740992E15d;
    }
}
