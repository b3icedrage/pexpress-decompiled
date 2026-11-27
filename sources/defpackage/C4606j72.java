package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import io.sentry.android.core.b0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: j72, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4606j72 {
    public static final C5869p72 a;
    public static final RU0<String, Typeface> b;

    /* JADX INFO: renamed from: j72$a */
    public static class a extends C3043bv {
        public C7708xt1.e b;
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new C5659o72();
        } else if (i >= 28) {
            a = new C5449n72();
        } else if (i >= 26) {
            a = new C5239m72();
        } else {
            Method method = C5026l72.c;
            if (method == null) {
                b0.e("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                a = new C5026l72();
            } else {
                a = new C4816k72();
            }
        }
        b = new RU0<>(16);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    public static Typeface a(@NonNull Context context, @NonNull C3624eh0.b bVar, @NonNull Resources resources, int i, String str, int i2, int i3, C7708xt1.e eVar, boolean z) {
        Typeface typefaceA;
        Typeface typefaceCreate;
        boolean z2 = false;
        if (bVar instanceof C3624eh0.e) {
            C3624eh0.e eVar2 = (C3624eh0.e) bVar;
            String str2 = eVar2.d;
            typefaceA = null;
            if (str2 == null || str2.isEmpty()) {
                typefaceCreate = null;
            } else {
                typefaceCreate = Typeface.create(str2, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                    typefaceCreate = null;
                }
            }
            if (typefaceCreate != null) {
                if (eVar != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC7918yt1(0, eVar, typefaceCreate));
                }
                return typefaceCreate;
            }
            if (!z ? eVar == null : eVar2.c == 0) {
                z2 = true;
            }
            int i4 = z ? eVar2.b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            a aVar = new a();
            aVar.b = eVar;
            C2487Yg0 c2487Yg0 = eVar2.a;
            C2273Vx c2273Vx = new C2273Vx(aVar, handler);
            if (z2) {
                RU0<String, Typeface> ru0 = C3415dh0.a;
                String str3 = c2487Yg0.e + "-" + i3;
                Typeface typeface = C3415dh0.a.get(str3);
                if (typeface != null) {
                    handler.post(new RunnableC2117Tx(aVar, typeface));
                    typefaceA = typeface;
                } else if (i4 == -1) {
                    C3415dh0.a aVarA = C3415dh0.a(str3, context, c2487Yg0, i3);
                    c2273Vx.a(aVarA);
                    typefaceA = aVarA.a;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    C3415dh0.a aVar2 = (C3415dh0.a) C3415dh0.b.submit(new CallableC2565Zg0(str3, context, c2487Yg0, i3)).get(i4, TimeUnit.MILLISECONDS);
                                    c2273Vx.a(aVar2);
                                    typefaceA = aVar2.a;
                                } catch (TimeoutException unused) {
                                    throw new InterruptedException("timeout");
                                }
                            } catch (InterruptedException e) {
                                throw e;
                            }
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        }
                    } catch (InterruptedException unused2) {
                        c2273Vx.b.post(new RunnableC2195Ux(c2273Vx.a, -3));
                    }
                }
            } else {
                RU0<String, Typeface> ru1 = C3415dh0.a;
                String str4 = c2487Yg0.e + "-" + i3;
                Typeface typeface2 = C3415dh0.a.get(str4);
                if (typeface2 != null) {
                    handler.post(new RunnableC2117Tx(aVar, typeface2));
                    typefaceA = typeface2;
                } else {
                    C2772ah0 c2772ah0 = new C2772ah0(c2273Vx);
                    synchronized (C3415dh0.c) {
                        try {
                            C2703aM1<String, ArrayList<InterfaceC3760fL<C3415dh0.a>>> c2703aM1 = C3415dh0.d;
                            ArrayList<InterfaceC3760fL<C3415dh0.a>> orDefault = c2703aM1.getOrDefault(str4, null);
                            if (orDefault != null) {
                                orDefault.add(c2772ah0);
                            } else {
                                ArrayList<InterfaceC3760fL<C3415dh0.a>> arrayList = new ArrayList<>();
                                arrayList.add(c2772ah0);
                                c2703aM1.put(str4, arrayList);
                                CallableC2996bh0 callableC2996bh0 = new CallableC2996bh0(str4, context, c2487Yg0, i3);
                                ThreadPoolExecutor threadPoolExecutor = C3415dh0.b;
                                C3205ch0 c3205ch0 = new C3205ch0(str4);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                RunnableC0620As1 runnableC0620As1 = new RunnableC0620As1();
                                runnableC0620As1.d = callableC2996bh0;
                                runnableC0620As1.e = c3205ch0;
                                runnableC0620As1.g = handler2;
                                threadPoolExecutor.execute(runnableC0620As1);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        } else {
            typefaceA = a.a(context, (C3624eh0.c) bVar, resources, i3);
            if (eVar != null) {
                if (typefaceA != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC7918yt1(0, eVar, typefaceA));
                } else {
                    eVar.a(-3);
                }
            }
        }
        if (typefaceA != null) {
            b.put(b(resources, i, str, i2, i3), typefaceA);
        }
        return typefaceA;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
