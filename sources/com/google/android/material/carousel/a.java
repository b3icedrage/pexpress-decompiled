package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final float a;
    public final List<b> b;
    public final int c;
    public final int d;

    /* JADX INFO: renamed from: com.google.android.material.carousel.a$a, reason: collision with other inner class name */
    public static final class C0308a {
        public final float a;
        public b c;
        public b d;
        public final ArrayList b = new ArrayList();
        public int e = -1;
        public int f = -1;
        public float g = 0.0f;

        public C0308a(float f) {
            this.a = f;
        }

        @NonNull
        public final void a(float f, float f2, float f3, boolean z) {
            if (f3 <= 0.0f) {
                return;
            }
            b bVar = new b(Float.MIN_VALUE, f, f2, f3);
            ArrayList arrayList = this.b;
            if (z) {
                if (this.c == null) {
                    this.c = bVar;
                    this.e = arrayList.size();
                }
                if (this.f != -1 && arrayList.size() - this.f > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f3 != this.c.d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.d = bVar;
                this.f = arrayList.size();
            } else {
                if (this.c == null && f3 < this.g) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.d != null && f3 > this.g) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.g = f3;
            arrayList.add(bVar);
        }

        @NonNull
        public final a b() {
            if (this.c == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList2 = this.b;
                int size = arrayList2.size();
                float f = this.a;
                if (i >= size) {
                    return new a(f, arrayList, this.e, this.f);
                }
                b bVar = (b) arrayList2.get(i);
                arrayList.add(new b((i * f) + (this.c.b - (this.e * f)), bVar.b, bVar.c, bVar.d));
                i++;
            }
        }
    }

    public static final class b {
        public final float a;
        public final float b;
        public final float c;
        public final float d;

        public b(float f, float f2, float f3, float f4) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }
    }

    public a(float f, ArrayList arrayList, int i, int i2) {
        this.a = f;
        this.b = Collections.unmodifiableList(arrayList);
        this.c = i;
        this.d = i2;
    }

    public final b a() {
        return this.b.get(this.c);
    }

    public final b b() {
        return this.b.get(0);
    }

    public final b c() {
        return this.b.get(this.d);
    }

    public final b d() {
        List<b> list = this.b;
        return list.get(list.size() - 1);
    }
}
