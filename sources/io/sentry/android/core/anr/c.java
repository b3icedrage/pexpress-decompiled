package io.sentry.android.core.anr;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public static final ArrayList a;

    public static final class a {

        @NotNull
        public final StackTraceElement[] a;
        public final int b;
        public final int c;
        public final int d;

        public a(@NotNull StackTraceElement[] stackTraceElementArr, int i, int i2) {
            this.a = stackTraceElementArr;
            this.b = i;
            this.c = i2;
            int iHashCode = 1;
            while (i <= this.c) {
                iHashCode = (iHashCode * 31) + this.a[i].hashCode();
                i++;
            }
            this.d = iHashCode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.d != aVar.d) {
                return false;
            }
            int i = this.c;
            int i2 = this.b;
            int i3 = (i - i2) + 1;
            int i4 = aVar.c;
            int i5 = aVar.b;
            if (i3 != (i4 - i5) + 1) {
                return false;
            }
            for (int i6 = 0; i6 < i3; i6++) {
                if (!this.a[i2 + i6].equals(aVar.a[i5 + i6])) {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode() {
            return this.d;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(11);
        a = arrayList;
        arrayList.add("java.lang");
        arrayList.add("java.util");
        arrayList.add("android.app");
        arrayList.add("android.os.Handler");
        arrayList.add("android.os.Looper");
        arrayList.add("android.view");
        arrayList.add("android.widget");
        arrayList.add("com.android.internal");
        arrayList.add("com.google.android");
        arrayList.add("kotlin");
        arrayList.add("kotlinx.coroutines");
    }
}
