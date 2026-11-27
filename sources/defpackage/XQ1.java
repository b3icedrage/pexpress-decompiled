package defpackage;

import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class XQ1 implements VQ1 {

    @NotNull
    public final C7652xe a;

    @NotNull
    public final AL1 b;

    @NotNull
    public final GP1 c;

    @NotNull
    public final GP1 d;

    @NotNull
    public final GP1 e;

    @NotNull
    public final GP1 f;

    @NotNull
    public final GP1 g;

    @NotNull
    public final GP1 h;

    @NotNull
    public final GP1 i;

    @NotNull
    public final GP1 j;

    @NotNull
    public final C6120qK1 k;

    @NotNull
    public final GP1 l;

    @Nullable
    public C2936bP1 m;

    @Nullable
    public LifecycleCoroutineScopeImpl n;

    @InterfaceC3368dU(c = "com.base.feature.stories.providers.StoriesProviderBase$cancel$1", f = "StoriesProviderBase.kt", l = {205}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return XQ1.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C6120qK1 c6120qK1 = XQ1.this.k;
                Unit unit = Unit.a;
                this.d = 1;
                if (c6120qK1.a(unit, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    @InterfaceC3368dU(c = "com.base.feature.stories.providers.StoriesProviderBase$setupNewBlock$2", f = "StoriesProviderBase.kt", l = {169}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public b(JM<? super b> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return XQ1.this.new b(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                XQ1 xq1 = XQ1.this;
                int iIntValue = ((Number) xq1.e.getValue()).intValue();
                this.d = 1;
                Object objA = xq1.b.a(new WQ1(xq1, iIntValue), this);
                if (objA != mn) {
                    objA = Unit.a;
                }
                if (objA == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    public XQ1(@NotNull C7652xe storiesIdsProvider, @NotNull AL1 shownStoriesUseCase) {
        Intrinsics.checkNotNullParameter(storiesIdsProvider, "storiesIdsProvider");
        Intrinsics.checkNotNullParameter(shownStoriesUseCase, "shownStoriesUseCase");
        this.a = storiesIdsProvider;
        this.b = shownStoriesUseCase;
        C5653o60 c5653o60 = C5653o60.d;
        this.c = C1589Ne.i(c5653o60);
        this.d = C1589Ne.i(new C3361dR1(c5653o60));
        GP1 gp1I = C1589Ne.i(0);
        this.e = gp1I;
        this.f = gp1I;
        this.g = C1589Ne.i(new C3151cR1(null, null, null, null, null, 511));
        GP1 gp1I2 = C1589Ne.i(0);
        this.h = gp1I2;
        this.i = gp1I2;
        this.j = C1589Ne.i(Float.valueOf(0.0f));
        this.k = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.l = C1589Ne.i(Boolean.FALSE);
    }

    @Override // defpackage.VQ1
    public final void a(int i) {
        while (true) {
            GP1 gp1 = this.f;
            if (i == ((Number) gp1.getValue()).intValue()) {
                return;
            }
            if (i > ((Number) gp1.getValue()).intValue()) {
                q();
            } else {
                p();
            }
        }
    }

    @Override // defpackage.VQ1
    public final void b() {
        Boolean bool = Boolean.TRUE;
        GP1 gp1 = this.l;
        gp1.getClass();
        gp1.m(null, bool);
    }

    @Override // defpackage.VQ1
    public final void c(int i, @NotNull List stories) {
        Intrinsics.checkNotNullParameter(stories, "stories");
        List listA = CollectionsKt.A(stories, i);
        C5189lv.k(C3286d41.a, null, new ZQ1(this, i, null), 3);
        ArrayList arrayList = new ArrayList(XE.m(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(new C3361dR1((List) it.next()));
        }
        GP1 gp1 = this.c;
        gp1.getClass();
        gp1.m(null, arrayList);
        GP1 gp2 = this.e;
        gp2.getClass();
        gp2.m(null, 0);
        this.d.setValue(((List) gp1.getValue()).get(((Number) this.f.getValue()).intValue()));
        r();
        Float fValueOf = Float.valueOf(0.0f);
        GP1 gp3 = this.j;
        gp3.getClass();
        gp3.m(null, fValueOf);
    }

    @Override // defpackage.VQ1
    public final void cancel() {
        C2936bP1 c2936bP1 = this.m;
        if (c2936bP1 != null) {
            c2936bP1.l(null);
        }
        C5653o60 c5653o60 = C5653o60.d;
        this.c.setValue(c5653o60);
        C3361dR1 c3361dR1 = new C3361dR1(c5653o60);
        GP1 gp1 = this.d;
        gp1.getClass();
        gp1.m(null, c3361dR1);
        C3151cR1 c3151cR1 = new C3151cR1(null, null, null, null, null, 511);
        GP1 gp2 = this.g;
        gp2.getClass();
        gp2.m(null, c3151cR1);
        Float fValueOf = Float.valueOf(0.0f);
        GP1 gp3 = this.j;
        gp3.getClass();
        gp3.m(null, fValueOf);
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.n;
        if (lifecycleCoroutineScopeImpl != null) {
            C5189lv.k(lifecycleCoroutineScopeImpl, null, new a(null), 3);
        }
    }

    @Override // defpackage.VQ1
    @NotNull
    public final GP1 d() {
        return this.j;
    }

    @Override // defpackage.VQ1
    @NotNull
    public final C6120qK1 e() {
        return this.k;
    }

    @Override // defpackage.VQ1
    public final void f() {
        GP1 gp1 = this.d;
        if (((C3361dR1) gp1.getValue()).a.indexOf(this.g.getValue()) == 0) {
            p();
            return;
        }
        ((C3361dR1) gp1.getValue()).b--;
        n();
    }

    @Override // defpackage.VQ1
    public final void g() {
        Boolean bool = Boolean.FALSE;
        GP1 gp1 = this.l;
        gp1.getClass();
        gp1.m(null, bool);
    }

    @Override // defpackage.VQ1
    @NotNull
    public final GP1 h() {
        return this.i;
    }

    @Override // defpackage.VQ1
    @NotNull
    public final GP1 i() {
        return this.f;
    }

    @Override // defpackage.VQ1
    public final void j() {
        int iIntValue = ((Number) this.i.getValue()).intValue();
        GP1 gp1 = this.d;
        if (iIntValue == WE.e(((C3361dR1) gp1.getValue()).a)) {
            q();
            return;
        }
        ((C3361dR1) gp1.getValue()).b++;
        n();
    }

    @Override // defpackage.VQ1
    @NotNull
    public final List<List<C3151cR1>> k() {
        Iterable iterable = (Iterable) this.c.getValue();
        ArrayList arrayList = new ArrayList(XE.m(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((C3361dR1) it.next()).a);
        }
        return CollectionsKt.e0(arrayList);
    }

    @Override // defpackage.VQ1
    public final void l(@NotNull LifecycleCoroutineScopeImpl scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        C2936bP1 c2936bP1 = this.m;
        if (c2936bP1 != null) {
            c2936bP1.l(null);
        }
        this.n = scope;
        n();
    }

    @Override // defpackage.VQ1
    @NotNull
    public final GP1 m() {
        return this.g;
    }

    public final void n() {
        r();
        C2936bP1 c2936bP1 = this.m;
        if (c2936bP1 != null) {
            c2936bP1.l(null);
        }
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.n;
        this.m = lifecycleCoroutineScopeImpl != null ? C5189lv.k(lifecycleCoroutineScopeImpl, C6266r20.a, new YQ1(this, null), 2) : null;
        g();
    }

    public final void o(int i) {
        GP1 gp1;
        Object value;
        do {
            gp1 = this.e;
            value = gp1.getValue();
        } while (!gp1.d(value, Integer.valueOf(((Number) value).intValue() + i)));
        C5189lv.k(C3286d41.a, null, new b(null), 3);
        this.d.setValue(((List) this.c.getValue()).get(((Number) this.f.getValue()).intValue()));
    }

    public final void p() {
        if (((List) this.c.getValue()).indexOf(this.d.getValue()) != 0) {
            o(-1);
        }
        n();
    }

    public final void q() {
        if (((Number) this.f.getValue()).intValue() == WE.e(k())) {
            cancel();
        } else {
            o(1);
            n();
        }
    }

    public final void r() {
        GP1 gp1 = this.d;
        Integer numValueOf = Integer.valueOf(((C3361dR1) gp1.getValue()).b);
        GP1 gp2 = this.h;
        gp2.getClass();
        gp2.m(null, numValueOf);
        this.g.setValue(((C3361dR1) gp1.getValue()).a.get(((Number) this.i.getValue()).intValue()));
    }
}
