package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.g;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7716xw0 {

    @NotNull
    public final Context a;

    @NotNull
    public final Object b;

    @Nullable
    public final InterfaceC5739oX1 c;

    @Nullable
    public final ColorSpace d;

    @NotNull
    public final List<InterfaceC6696t42> e;

    @NotNull
    public final C2813ao0 f;

    @NotNull
    public final C2053Tb1 g;

    @NotNull
    public final g h;

    @NotNull
    public final OM1 i;

    @NotNull
    public final XC1 j;

    @NotNull
    public final DN k;

    @NotNull
    public final U0 l;

    @NotNull
    public final EnumC2303Wf1 m;

    @NotNull
    public final Bitmap.Config n;
    public final boolean o;
    public final boolean p;
    public final boolean q;

    @NotNull
    public final EnumC5195lx r;

    @NotNull
    public final EnumC5195lx s;

    @NotNull
    public final EnumC5195lx t;
    public final Integer u;
    public final Integer v;

    @NotNull
    public final AW w;

    @NotNull
    public final KV x;

    /* JADX INFO: renamed from: xw0$b */
    public interface b {
        void b(@NotNull C7716xw0 c7716xw0, @NotNull AbstractC7926yw0.a aVar);

        void c(@NotNull C7716xw0 c7716xw0);

        void i(@NotNull C7716xw0 c7716xw0);

        void k(@NotNull C7716xw0 c7716xw0, @NotNull Throwable th);
    }

    public C7716xw0() {
        throw null;
    }

    public C7716xw0(Context context, Object obj, InterfaceC5739oX1 interfaceC5739oX1, ColorSpace colorSpace, List list, C2813ao0 c2813ao0, C2053Tb1 c2053Tb1, g gVar, OM1 om1, XC1 xc1, DN dn, U0 u0, EnumC2303Wf1 enumC2303Wf1, Bitmap.Config config, boolean z, boolean z2, boolean z3, EnumC5195lx enumC5195lx, EnumC5195lx enumC5195lx2, EnumC5195lx enumC5195lx3, Integer num, Integer num2, AW aw, KV kv) {
        this.a = context;
        this.b = obj;
        this.c = interfaceC5739oX1;
        this.d = colorSpace;
        this.e = list;
        this.f = c2813ao0;
        this.g = c2053Tb1;
        this.h = gVar;
        this.i = om1;
        this.j = xc1;
        this.k = dn;
        this.l = u0;
        this.m = enumC2303Wf1;
        this.n = config;
        this.o = z;
        this.p = z2;
        this.q = z3;
        this.r = enumC5195lx;
        this.s = enumC5195lx2;
        this.t = enumC5195lx3;
        this.u = num;
        this.v = num2;
        this.w = aw;
        this.x = kv;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7716xw0)) {
            return false;
        }
        C7716xw0 c7716xw0 = (C7716xw0) obj;
        return Intrinsics.a(this.a, c7716xw0.a) && Intrinsics.a(this.b, c7716xw0.b) && Intrinsics.a(this.c, c7716xw0.c) && Intrinsics.a(this.d, c7716xw0.d) && Intrinsics.a(this.e, c7716xw0.e) && Intrinsics.a(this.f, c7716xw0.f) && Intrinsics.a(this.g, c7716xw0.g) && Intrinsics.a(this.h, c7716xw0.h) && Intrinsics.a(this.i, c7716xw0.i) && this.j == c7716xw0.j && Intrinsics.a(this.k, c7716xw0.k) && Intrinsics.a(this.l, c7716xw0.l) && this.m == c7716xw0.m && this.n == c7716xw0.n && this.o == c7716xw0.o && this.p == c7716xw0.p && this.q == c7716xw0.q && this.r == c7716xw0.r && this.s == c7716xw0.s && this.t == c7716xw0.t && Intrinsics.a(this.u, c7716xw0.u) && Intrinsics.a(this.v, c7716xw0.v) && Intrinsics.a(this.w, c7716xw0.w) && Intrinsics.a(this.x, c7716xw0.x);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        InterfaceC5739oX1 interfaceC5739oX1 = this.c;
        int iHashCode2 = (iHashCode + (interfaceC5739oX1 != null ? interfaceC5739oX1.hashCode() : 0)) * 923521;
        ColorSpace colorSpace = this.d;
        int iHashCode3 = (this.t.hashCode() + ((this.s.hashCode() + ((this.r.hashCode() + C2983be.a(C2983be.a(C2983be.a((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.d.hashCode() + ((C5491nL.b((iHashCode2 + (colorSpace != null ? colorSpace.hashCode() : 0)) * 29791, 31, this.e) + Arrays.hashCode(this.f.d)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, this.o, 31), this.p, 31), this.q, 31)) * 31)) * 31)) * 31;
        Integer num = this.u;
        int iIntValue = (iHashCode3 + (num != null ? num.intValue() : 0)) * 961;
        Integer num2 = this.v;
        return this.x.hashCode() + ((this.w.hashCode() + ((iIntValue + (num2 != null ? num2.intValue() : 0)) * 923521)) * 31);
    }

    @NotNull
    public final String toString() {
        return "ImageRequest(context=" + this.a + ", data=" + this.b + ", target=" + this.c + ", listener=null, memoryCacheKey=null, placeholderMemoryCacheKey=null, colorSpace=" + this.d + ", fetcher=null, decoder=null, transformations=" + this.e + ", headers=" + this.f + ", parameters=" + this.g + ", lifecycle=" + this.h + ", sizeResolver=" + this.i + ", scale=" + this.j + ", dispatcher=" + this.k + ", transition=" + this.l + ", precision=" + this.m + ", bitmapConfig=" + this.n + ", allowHardware=" + this.o + ", allowRgb565=" + this.p + ", premultipliedAlpha=" + this.q + ", memoryCachePolicy=" + this.r + ", diskCachePolicy=" + this.s + ", networkCachePolicy=" + this.t + ", placeholderResId=" + this.u + ", placeholderDrawable=null, errorResId=" + this.v + ", errorDrawable=null, fallbackResId=null, fallbackDrawable=null, defined=" + this.w + ", defaults=" + this.x + ')';
    }

    /* JADX INFO: renamed from: xw0$a */
    public static final class a {
        public final Context a;
        public KV b;
        public Object c;
        public InterfaceC5739oX1 d;
        public final ColorSpace e;
        public List<? extends InterfaceC6696t42> f;
        public final C2813ao0.a g;
        public final C2053Tb1.a h;
        public C6432ro1 i;
        public final boolean j;
        public Integer k;
        public Integer l;
        public g m;
        public OM1 n;
        public XC1 o;

        public a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.a = context;
            this.b = KV.i;
            this.c = null;
            this.d = null;
            if (Build.VERSION.SDK_INT >= 26) {
                this.e = null;
            }
            this.f = C5653o60.d;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = true;
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
            this.o = null;
        }

        /* JADX WARN: Code duplicated, block: B:61:0x00d2  */
        /* JADX WARN: Code duplicated, block: B:66:0x00e5  */
        @NotNull
        public final C7716xw0 a() {
            OM1 c7062uo1;
            ImageView.ScaleType scaleType;
            InterfaceC5739oX1 interfaceC5739oX1;
            ImageView imageViewE;
            Object obj = this.c;
            if (obj == null) {
                obj = UE.e;
            }
            Object obj2 = obj;
            InterfaceC5739oX1 interfaceC5739oX2 = this.d;
            ColorSpace colorSpace = this.e;
            List<? extends InterfaceC6696t42> list = this.f;
            C2813ao0.a aVar = this.g;
            g lifecycle = null;
            C2813ao0 c2813ao0D = aVar != null ? aVar.d() : null;
            if (c2813ao0D != null) {
                C2813ao0 c2813ao0 = C4316i.a;
            } else {
                c2813ao0D = C4316i.a;
            }
            Intrinsics.checkNotNullExpressionValue(c2813ao0D, "headers?.build().orEmpty()");
            C2053Tb1.a aVar2 = this.h;
            C2053Tb1 c2053Tb1 = aVar2 != null ? new C2053Tb1(PW0.k(aVar2.a)) : null;
            if (c2053Tb1 == null) {
                c2053Tb1 = C2053Tb1.e;
            }
            C2053Tb1 c2053Tb2 = c2053Tb1;
            g gVar = this.m;
            Context context = this.a;
            if (gVar == null) {
                InterfaceC5739oX1 interfaceC5739oX3 = this.d;
                Object context2 = interfaceC5739oX3 instanceof InterfaceC7234ve2 ? ((InterfaceC7234ve2) interfaceC5739oX3).e().getContext() : context;
                while (true) {
                    if (context2 instanceof FP0) {
                        lifecycle = ((FP0) context2).getLifecycle();
                        break;
                    }
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
                if (lifecycle == null) {
                    lifecycle = C5585nm0.c;
                }
                gVar = lifecycle;
            }
            OM1 c7106v20 = this.i;
            if (c7106v20 == null) {
                c7106v20 = this.n;
            }
            if (c7106v20 == null) {
                InterfaceC5739oX1 interfaceC5739oX4 = this.d;
                if (interfaceC5739oX4 instanceof InterfaceC7234ve2) {
                    ImageView view = ((InterfaceC7234ve2) interfaceC5739oX4).e();
                    if (view == null || !((scaleType = view.getScaleType()) == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX)) {
                        Intrinsics.checkNotNullParameter(view, "view");
                        c7062uo1 = new C7062uo1(view);
                    } else {
                        C5748oa1 size = C5748oa1.d;
                        Intrinsics.checkNotNullParameter(size, "size");
                        c7062uo1 = new C6432ro1(size);
                    }
                    c7106v20 = c7062uo1;
                } else {
                    c7106v20 = new C7106v20(context);
                }
            }
            OM1 om1 = c7106v20;
            XC1 xc1C = this.o;
            if (xc1C == null) {
                OM1 om2 = this.i;
                if (om2 instanceof InterfaceC5975pe2) {
                    View viewB = ((InterfaceC5975pe2) om2).b();
                    if (viewB instanceof ImageView) {
                        xc1C = C4316i.c((ImageView) viewB);
                    } else {
                        interfaceC5739oX1 = this.d;
                        if ((interfaceC5739oX1 instanceof InterfaceC7234ve2) || (imageViewE = ((InterfaceC7234ve2) interfaceC5739oX1).e()) == null) {
                            xc1C = XC1.d;
                        } else {
                            xc1C = C4316i.c(imageViewE);
                        }
                    }
                } else {
                    interfaceC5739oX1 = this.d;
                    if (interfaceC5739oX1 instanceof InterfaceC7234ve2) {
                        xc1C = XC1.d;
                    } else {
                        xc1C = XC1.d;
                    }
                }
            }
            XC1 xc1 = xc1C;
            KV kv = this.b;
            ExecutorC7200vV executorC7200vV = kv.a;
            U0 u0 = kv.b;
            EnumC2303Wf1 enumC2303Wf1 = kv.c;
            Bitmap.Config config = kv.d;
            boolean z = kv.e;
            kv.getClass();
            KV kv2 = this.b;
            return new C7716xw0(this.a, obj2, interfaceC5739oX2, colorSpace, list, c2813ao0D, c2053Tb2, gVar, om1, xc1, executorC7200vV, u0, enumC2303Wf1, config, z, false, this.j, kv2.f, kv2.g, kv2.h, this.k, this.l, new AW(this.i), kv2);
        }

        @NotNull
        public final void b(int i) {
            C1433Ld1 size = new C1433Ld1(i, i);
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(size, "size");
            C6432ro1 resolver = new C6432ro1(size);
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            this.i = resolver;
            this.m = null;
            this.n = null;
            this.o = null;
        }

        @NotNull
        public final void c(@NotNull InterfaceC6696t42... transformations) {
            Intrinsics.checkNotNullParameter(transformations, "transformations");
            List transformations2 = C1526Mj.F(transformations);
            Intrinsics.checkNotNullParameter(transformations2, "transformations");
            this.f = CollectionsKt.e0(transformations2);
        }

        public a(@NotNull C7716xw0 request, @NotNull Context context) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(context, "context");
            this.a = context;
            this.b = request.x;
            this.c = request.b;
            this.d = request.c;
            if (Build.VERSION.SDK_INT >= 26) {
                this.e = request.d;
            }
            this.f = request.e;
            this.g = request.f.d();
            C2053Tb1 c2053Tb1 = request.g;
            c2053Tb1.getClass();
            this.h = new C2053Tb1.a(c2053Tb1);
            AW aw = request.w;
            aw.getClass();
            this.i = aw.a;
            this.j = request.q;
            this.k = request.u;
            this.l = request.v;
            if (request.a == context) {
                this.m = request.h;
                this.n = request.i;
                this.o = request.j;
            } else {
                this.m = null;
                this.n = null;
                this.o = null;
            }
        }
    }
}
