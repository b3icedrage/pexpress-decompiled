package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: dh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3415dh0 {
    public static final RU0<String, Typeface> a = new RU0<>(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final C2703aM1<String, ArrayList<InterfaceC3760fL<a>>> d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC8125zs1());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new C2703aM1<>();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e A[EDGE_INSN: B:10:0x001e->B:24:0x003b BREAK  A[LOOP:0: B:17:0x002b->B:23:0x0038]] */
    @NonNull
    public static a a(@NonNull String str, @NonNull Context context, @NonNull C2487Yg0 c2487Yg0, int i) {
        RU0<String, Typeface> ru0 = a;
        Typeface typeface = ru0.get(str);
        if (typeface != null) {
            return new a(typeface);
        }
        try {
            C3834fh0 c3834fh0A = C2409Xg0.a(context, c2487Yg0);
            int i2 = 1;
            C4044gh0[] c4044gh0Arr = c3834fh0A.b;
            int i3 = c3834fh0A.a;
            if (i3 != 0) {
                if (i3 != 1) {
                    i2 = -3;
                    break;
                }
                i2 = -2;
            } else if (c4044gh0Arr != null && c4044gh0Arr.length != 0) {
                i2 = 0;
                for (C4044gh0 c4044gh0 : c4044gh0Arr) {
                    int i4 = c4044gh0.e;
                    if (i4 != 0) {
                        if (i4 >= 0) {
                            i2 = i4;
                            break;
                        }
                        i2 = -3;
                        break;
                    }
                }
            }
            if (i2 != 0) {
                return new a(i2);
            }
            Typeface typefaceB = C4606j72.a.b(context, c4044gh0Arr, i);
            if (typefaceB == null) {
                return new a(-3);
            }
            ru0.put(str, typefaceB);
            return new a(typefaceB);
        } catch (PackageManager.NameNotFoundException unused) {
            return new a(-1);
        }
    }

    /* JADX INFO: renamed from: dh0$a */
    public static final class a {
        public final Typeface a;
        public final int b;

        public a(int i) {
            this.a = null;
            this.b = i;
        }

        @SuppressLint({"WrongConstant"})
        public a(@NonNull Typeface typeface) {
            this.a = typeface;
            this.b = 0;
        }
    }
}
