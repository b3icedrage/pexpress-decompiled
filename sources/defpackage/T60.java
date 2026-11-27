package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class T60 implements TB0 {
    public final C5899pH a;
    public final C2509Yn1 b;
    public final InterfaceC1086Gs c;
    public final OS1 d;
    public final C3665et e;
    public final C1948Rs1 f;
    public final PW1 g;
    public final E30 h;

    public T60(@NotNull C5899pH registry, @NotNull C2509Yn1 bitmapPool, @NotNull InterfaceC1086Gs referenceCounter, @NotNull OS1 strongMemoryCache, @NotNull C3665et memoryCacheService, @NotNull C1948Rs1 requestService, @NotNull PW1 systemCallbacks, @NotNull E30 drawableDecoder) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(bitmapPool, "bitmapPool");
        Intrinsics.checkNotNullParameter(referenceCounter, "referenceCounter");
        Intrinsics.checkNotNullParameter(strongMemoryCache, "strongMemoryCache");
        Intrinsics.checkNotNullParameter(memoryCacheService, "memoryCacheService");
        Intrinsics.checkNotNullParameter(requestService, "requestService");
        Intrinsics.checkNotNullParameter(systemCallbacks, "systemCallbacks");
        Intrinsics.checkNotNullParameter(drawableDecoder, "drawableDecoder");
        this.a = registry;
        this.b = bitmapPool;
        this.c = referenceCounter;
        this.d = strongMemoryCache;
        this.e = memoryCacheService;
        this.f = requestService;
        this.g = systemCallbacks;
        this.h = drawableDecoder;
    }

    @Nullable
    public static XY0.a b(@NotNull C7716xw0 request, @NotNull Object data, @NotNull InterfaceC5122lc0 fetcher, @NotNull LM1 size) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(fetcher, "fetcher");
        Intrinsics.checkNotNullParameter(size, "size");
        String strB = fetcher.b(data);
        if (strB == null) {
            return null;
        }
        boolean zIsEmpty = request.e.isEmpty();
        C2053Tb1 c2053Tb1 = request.g;
        if (zIsEmpty) {
            return new XY0.a(strB, C5653o60.d, null, c2053Tb1.b());
        }
        List<InterfaceC6696t42> list = request.e;
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i = 0; i < size2; i++) {
            arrayList.add(list.get(i).b());
        }
        return new XY0.a(strB, arrayList, size, c2053Tb1.b());
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0101  */
    /* JADX WARN: Code duplicated, block: B:46:0x012e  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v20, types: [po1] */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [T, po1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, lc0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, XY0$a] */
    /* JADX WARN: Type inference failed for: r3v5, types: [T, xw0] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [LM1, T] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, y80] */
    @Override // defpackage.TB0
    @Nullable
    public final Object a(@NotNull C5803oo1 c5803oo1, @NotNull LM lm) throws Throwable {
        R60 r60;
        T60 t60;
        ?? B;
        BitmapDrawable bitmapDrawable;
        Bitmap bitmapB;
        C5803oo1 c5803oo2 = c5803oo1;
        C5899pH c5899pH = this.a;
        if (lm instanceof R60) {
            r60 = (R60) lm;
            int i = r60.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                r60.e = i - Integer.MIN_VALUE;
            } else {
                r60 = new R60(this, lm);
            }
        } else {
            r60 = new R60(this, lm);
        }
        R60 r61 = r60;
        Object obj = r61.d;
        MN mn = MN.d;
        int i2 = r61.e;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            try {
                if (c5803oo2 == null) {
                    throw new IllegalStateException("Check failed.");
                }
                C3027bp1 c3027bp1 = new C3027bp1();
                ?? r3 = c5803oo2.d;
                c3027bp1.d = r3;
                Context context = r3.a;
                Object obj2 = r3.b;
                C3027bp1 c3027bp2 = new C3027bp1();
                c3027bp2.d = c5803oo2.e;
                C3027bp1 c3027bp3 = new C3027bp1();
                ?? r5 = c5803oo2.g;
                c3027bp3.d = r5;
                r5.n((C7716xw0) c3027bp1.d, obj2);
                C3027bp1 c3027bp4 = new C3027bp1();
                ?? H = MP0.h(c5899pH, obj2);
                c3027bp4.d = H;
                ((InterfaceC7761y80) c3027bp3.d).e((C7716xw0) c3027bp1.d, H);
                C3027bp1 c3027bp5 = new C3027bp1();
                C7716xw0 fetcher = (C7716xw0) c3027bp1.d;
                Object data = c3027bp4.d;
                Intrinsics.checkNotNullParameter(fetcher, "$this$fetcher");
                Intrinsics.checkNotNullParameter(data, "data");
                fetcher.getClass();
                c3027bp5.d = MP0.j(c5899pH, c3027bp4.d);
                C3027bp1 c3027bp6 = new C3027bp1();
                Object obj3 = c3027bp1.d;
                ((C7716xw0) obj3).getClass();
                c3027bp6.d = b((C7716xw0) obj3, c3027bp4.d, (InterfaceC5122lc0) c3027bp5.d, (LM1) c3027bp2.d);
                C3027bp1 c3027bp7 = new C3027bp1();
                if (((C7716xw0) c3027bp1.d).r.d) {
                    C3665et c3665et = this.e;
                    XY0 xy0 = (XY0) c3027bp6.d;
                    if (xy0 != null) {
                        InterfaceC6013po1 interfaceC6013po1B = ((OS1) c3665et.e).b(xy0);
                        B = interfaceC6013po1B != null ? interfaceC6013po1B : ((Kf2) c3665et.g).b(xy0);
                        if (B != 0) {
                            ((InterfaceC1086Gs) c3665et.d).c(B.b());
                        }
                    } else {
                        B = 0;
                    }
                } else {
                    B = 0;
                }
                c3027bp7.d = B;
                if (B == 0 || (bitmapB = B.b()) == null) {
                    bitmapDrawable = null;
                } else {
                    if (!C1948Rs1.b((C7716xw0) c3027bp1.d, C3057c.h(bitmapB))) {
                        bitmapB = null;
                    }
                    if (bitmapB != null) {
                        Resources resources = context.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
                        bitmapDrawable = new BitmapDrawable(resources, bitmapB);
                    } else {
                        bitmapDrawable = null;
                    }
                }
                if (bitmapDrawable != null && c((XY0) c3027bp6.d, (InterfaceC6013po1) c3027bp7.d, (C7716xw0) c3027bp1.d, (LM1) c3027bp2.d)) {
                    Bitmap bitmapB2 = ((InterfaceC6013po1) c3027bp7.d).b();
                    Resources resources2 = context.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources2, "context.resources");
                    return new VU1(new BitmapDrawable(resources2, bitmapB2), (C7716xw0) c3027bp1.d, new AbstractC7926yw0.a((XY0) c3027bp6.d, ((InterfaceC6013po1) c3027bp7.d).a(), DS.d, c5803oo2.f != null));
                }
                DN dn = ((C7716xw0) c3027bp1.d).k;
                S60 s60 = new S60(this, c3027bp1, c3027bp7, c3027bp4, c3027bp5, c5803oo2, c3027bp2, c3027bp3, c3027bp6, null);
                r61.h = this;
                r61.i = c5803oo2;
                r61.e = 1;
                Object objP = C5189lv.p(dn, s60, r61);
                return objP == mn ? mn : objP;
            } catch (Throwable th) {
                th = th;
                t60 = this;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C5803oo1 c5803oo3 = r61.i;
            t60 = r61.h;
            try {
                C1795Pt1.b(obj);
                return obj;
            } catch (Throwable th2) {
                th = th2;
                c5803oo2 = c5803oo3;
            }
        }
        if (th instanceof CancellationException) {
            throw th;
        }
        C1948Rs1 c1948Rs1 = t60.f;
        return C1948Rs1.a(c5803oo2.d(), th);
    }

    public final boolean c(@Nullable XY0 xy0, @NotNull InterfaceC6013po1 cacheValue, @NotNull C7716xw0 request, @NotNull LM1 size) {
        int height;
        int i;
        Intrinsics.checkNotNullParameter(cacheValue, "cacheValue");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(size, "size");
        if (size instanceof C5748oa1) {
            if (cacheValue.a()) {
                return false;
            }
        } else if (size instanceof C1433Ld1) {
            if (!(xy0 instanceof XY0.a)) {
                xy0 = null;
            }
            XY0.a aVar = (XY0.a) xy0;
            LM1 lm1 = aVar != null ? aVar.g : null;
            if (lm1 instanceof C1433Ld1) {
                C1433Ld1 c1433Ld1 = (C1433Ld1) lm1;
                i = c1433Ld1.d;
                height = c1433Ld1.e;
            } else {
                if (!Intrinsics.a(lm1, C5748oa1.d) && lm1 != null) {
                    throw new C6489s51();
                }
                Bitmap bitmapB = cacheValue.b();
                int width = bitmapB.getWidth();
                height = bitmapB.getHeight();
                i = width;
            }
            C1433Ld1 c1433Ld2 = (C1433Ld1) size;
            int iAbs = Math.abs(i - c1433Ld2.d);
            int i2 = c1433Ld2.e;
            if (iAbs > 1 || Math.abs(height - i2) > 1) {
                double dB = C7618xU.b(i, height, c1433Ld2.d, i2, request.j);
                if (dB != 1.0d && !C5207m.e(request)) {
                    return false;
                }
                if (dB > 1.0d && cacheValue.a()) {
                    return false;
                }
            }
        }
        return C1948Rs1.b(request, C3057c.h(cacheValue.b()));
    }
}
