package defpackage;

import android.content.Context;
import com.api.feature.analytics.reporters.ReporterApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: oj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5783oj0 extends C7576xG implements InterfaceC3570eR1 {

    @NotNull
    public final VQ1 d;

    @NotNull
    public final ReporterApi e;

    @NotNull
    public final InterfaceC6396rf0<Unit> f;

    @NotNull
    public final FP1<Integer> g;

    @NotNull
    public final InterfaceC6396rf0<C3151cR1> h;

    @NotNull
    public final FP1<Integer> i;

    @NotNull
    public final InterfaceC6396rf0<Float> j;

    /* JADX INFO: renamed from: oj0$a */
    @InterfaceC3368dU(c = "com.base.feature.stories.screens.full.FullStoriesViewModelBase$1", f = "FullStoriesViewModelBase.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements InterfaceC1138Hj0<C3151cR1, Float, Integer, JM<? super Unit>, Object> {
        public /* synthetic */ C3151cR1 d;
        public /* synthetic */ float e;
        public /* synthetic */ int g;
        public final /* synthetic */ Context i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, JM<? super a> jm) {
            super(4, jm);
            this.i = context;
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            Object next;
            MN mn = MN.d;
            C1795Pt1.b(obj);
            C3151cR1 c3151cR1 = this.d;
            float f = this.e;
            int i = this.g;
            if (f == 1.0f) {
                C5783oj0 c5783oj0 = C5783oj0.this;
                Iterator<T> it = c5783oj0.d.k().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((List) next).contains(c3151cR1));
                List list = (List) next;
                if (list != null && i == WE.e(list)) {
                    ReporterApi.a.b(c5783oj0.e, EnumC5028l80.T0, new UQ1(i + 1, C5783oj0.l(c3151cR1, this.i)), null, 12);
                }
            }
            return Unit.a;
        }

        @Override // defpackage.InterfaceC1138Hj0
        public final Object l(C3151cR1 c3151cR1, Float f, Integer num, JM<? super Unit> jm) {
            float fFloatValue = f.floatValue();
            int iIntValue = num.intValue();
            a aVar = C5783oj0.this.new a(this.i, jm);
            aVar.d = c3151cR1;
            aVar.e = fFloatValue;
            aVar.g = iIntValue;
            return aVar.invokeSuspend(Unit.a);
        }
    }

    public C5783oj0(@NotNull VQ1 storiesProvider, @NotNull ReporterApi reporter, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(storiesProvider, "storiesProvider");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(context, "context");
        this.d = storiesProvider;
        this.e = reporter;
        this.f = storiesProvider.e();
        this.g = storiesProvider.i();
        GP1 gp1M = storiesProvider.m();
        this.h = gp1M;
        GP1 gp1H = storiesProvider.h();
        this.i = gp1H;
        GP1 gp1D = storiesProvider.d();
        this.j = gp1D;
        C4466ii.v(C8056za.j(this), C4466ii.k(gp1M, gp1D, gp1H, new a(context, null)));
    }

    public static String l(C3151cR1 c3151cR1, Context context) {
        String string;
        List<Integer> list = c3151cR1.b;
        Integer num = c3151cR1.a;
        if (list != null && num != null) {
            Intrinsics.checkNotNull(num);
            int iIntValue = num.intValue();
            List<Integer> list2 = c3151cR1.b;
            Intrinsics.checkNotNull(list2);
            ArrayList arrayList = new ArrayList(XE.m(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(context.getString(((Number) it.next()).intValue()));
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            string = context.getString(iIntValue, Arrays.copyOf(strArr, strArr.length));
        } else if (num != null) {
            Intrinsics.checkNotNull(num);
            string = context.getString(num.intValue());
        } else {
            string = "";
        }
        Intrinsics.checkNotNull(string);
        return string;
    }

    @Override // defpackage.InterfaceC3570eR1
    public final void a() {
        this.d.f();
    }

    @Override // defpackage.InterfaceC3570eR1
    public final void b() {
        this.d.b();
    }

    @Override // defpackage.InterfaceC3570eR1
    public final void cancel() {
        this.d.cancel();
    }

    @Override // defpackage.InterfaceC3570eR1
    public final void e() {
        this.d.g();
    }

    @Override // defpackage.InterfaceC3570eR1
    public final void f(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        FP1<Integer> fp1 = this.i;
        int iIntValue = fp1.getValue().intValue();
        VQ1 vq1 = this.d;
        List<List<C3151cR1>> listK = vq1.k();
        FP1<Integer> fp2 = this.g;
        C3151cR1 c3151cR1 = listK.get(fp2.getValue().intValue()).get(fp1.getValue().intValue());
        if (Intrinsics.a(c3151cR1, CollectionsKt.L(vq1.k().get(fp2.getValue().intValue())))) {
            String strL = l(c3151cR1, context);
            ReporterApi.a.b(this.e, EnumC5028l80.T0, new UQ1(iIntValue + 1, strL), null, 12);
        }
        vq1.j();
    }
}
