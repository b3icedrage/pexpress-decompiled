package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import defpackage.G1;

/* JADX INFO: loaded from: classes.dex */
public final class c extends G1 {
    public static final int[] e = {1};
    public static final int[] f = {1, 0};

    public static final class a {
        public final int a;
        public final float b;
        public final int c;
        public final int d;
        public final float e;
        public final float f;
        public final int g;
        public final float h;

        /* JADX WARN: Code duplicated, block: B:42:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:43:0x00b9  */
        public a(int i, float f, float f2, float f3, int i2, float f4, int i3, float f5, int i4, float f6) {
            float fAbs;
            this.a = i;
            if (f < f2) {
                f = f2;
            } else if (f > f3) {
                f = f3;
            }
            this.b = f;
            this.c = i2;
            this.e = f4;
            this.d = i3;
            this.f = f5;
            this.g = i4;
            float f7 = i4;
            float f8 = i3;
            float f9 = i2;
            float f10 = f6 - ((f * f9) + ((f4 * f8) + (f5 * f7)));
            if (i2 > 0 && f10 > 0.0f) {
                this.b = Math.min(f10 / f9, f3 - f) + f;
            } else if (i2 > 0 && f10 < 0.0f) {
                this.b = Math.max(f10 / f9, f2 - f) + f;
            }
            float f11 = this.b;
            float f12 = f8 / 2.0f;
            float f13 = (f6 - ((f9 + f12) * (i2 > 0 ? f11 : 0.0f))) / (f12 + f7);
            this.f = f13;
            float f14 = (f11 + f13) / 2.0f;
            this.e = f14;
            if (i3 > 0 && f13 != f5) {
                float f15 = (f5 - f13) * f7;
                float fMin = Math.min(Math.abs(f15), f14 * 0.1f * f8);
                if (f15 > 0.0f) {
                    this.e -= fMin / f8;
                    this.f = (fMin / f7) + this.f;
                } else {
                    this.e = (fMin / f8) + this.e;
                    this.f -= fMin / f7;
                }
            }
            if (i4 > 0 && i2 > 0 && i3 > 0) {
                float f16 = this.f;
                float f17 = this.e;
                if (f16 <= f17 || f17 <= this.b) {
                    fAbs = Float.MAX_VALUE;
                } else {
                    fAbs = i * Math.abs(f5 - this.f);
                }
            } else if (i4 <= 0 || i2 <= 0 || this.f > this.b) {
                fAbs = i * Math.abs(f5 - this.f);
            } else {
                fAbs = Float.MAX_VALUE;
            }
            this.h = fAbs;
        }

        @NonNull
        public final String toString() {
            return "Arrangement [priority=" + this.a + ", smallCount=" + this.c + ", smallSize=" + this.b + ", mediumCount=" + this.d + ", mediumSize=" + this.e + ", largeCount=" + this.g + ", largeSize=" + this.f + ", cost=" + this.h + "]";
        }
    }
}
