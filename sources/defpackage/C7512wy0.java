package defpackage;

import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import androidx.recyclerview.widget.RecyclerView;
import com.base.feature.robot.indicatorselection.screens.grouped_indicators.IndicatorPageItemFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: wy0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.indicatorselection.screens.grouped_indicators.IndicatorPageItemFragment$initFlowCollectors$$inlined$launchAndCollectIn$default$1", f = "IndicatorPageItemFragment.kt", l = {48}, m = "invokeSuspend")
public final class C7512wy0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ InterfaceC6396rf0 g;
    public final /* synthetic */ IndicatorPageItemFragment h;

    /* JADX INFO: renamed from: wy0$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.indicatorselection.screens.grouped_indicators.IndicatorPageItemFragment$initFlowCollectors$$inlined$launchAndCollectIn$default$1$1", f = "IndicatorPageItemFragment.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ InterfaceC6396rf0 g;
        public final /* synthetic */ IndicatorPageItemFragment h;

        /* JADX INFO: renamed from: wy0$a$a, reason: collision with other inner class name */
        public static final class C0530a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ IndicatorPageItemFragment e;

            public C0530a(KN kn, IndicatorPageItemFragment indicatorPageItemFragment) {
                this.e = indicatorPageItemFragment;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                T next;
                List list = (List) obj;
                IndicatorPageItemFragment indicatorPageItemFragment = this.e;
                RecyclerView.e adapter = indicatorPageItemFragment.k().e.getAdapter();
                Intrinsics.c(adapter, "null cannot be cast to non-null type com.base.feature.robot.indicatorselection.screens.ungrouped_indicators.adapter.IndicatorAdapter");
                C1728Ox0 c1728Ox0 = (C1728Ox0) adapter;
                Object obj2 = indicatorPageItemFragment.i;
                Intrinsics.checkNotNull(obj2);
                ((C0718Bz0) obj2).getClass();
                Intrinsics.checkNotNullParameter(list, "list");
                EnumC2121Ty0 indicatorType = indicatorPageItemFragment.k;
                Intrinsics.checkNotNullParameter(indicatorType, "indicatorType");
                ArrayList arrayList = new ArrayList();
                for (T t : list) {
                    C2846az0 c2846az0 = (C2846az0) t;
                    if (c2846az0.a.i.contains(indicatorType) || c2846az0.a.i.contains(EnumC2121Ty0.j)) {
                        arrayList.add(t);
                    }
                }
                List listZ = indicatorType == EnumC2121Ty0.g ? CollectionsKt.Z(arrayList, new C0952Ez0()) : CollectionsKt.Z(arrayList, new C0874Dz0());
                Iterator<T> it = listZ.iterator();
                do {
                    if (!it.hasNext()) {
                        next = (T) null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.a(((C2846az0) next).a.b, "summary"));
                C2846az0 c2846az1 = next;
                ArrayList arrayListF0 = CollectionsKt.f0(listZ);
                F62.a(arrayListF0).remove(c2846az1);
                if (c2846az1 != null) {
                    arrayListF0.add(0, c2846az1);
                }
                c1728Ox0.p(arrayListF0);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC6396rf0 interfaceC6396rf0, JM jm, IndicatorPageItemFragment indicatorPageItemFragment) {
            super(2, jm);
            this.g = interfaceC6396rf0;
            this.h = indicatorPageItemFragment;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = new a(this.g, jm, this.h);
            aVar.e = obj;
            return aVar;
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
                C0530a c0530a = new C0530a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0530a, this) == mn) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7512wy0(FP0 fp0, InterfaceC6396rf0 interfaceC6396rf0, JM jm, IndicatorPageItemFragment indicatorPageItemFragment) {
        super(2, jm);
        this.e = fp0;
        this.g = interfaceC6396rf0;
        this.h = indicatorPageItemFragment;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C7512wy0(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C7512wy0) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            a aVar = new a(this.g, null, this.h);
            this.d = 1;
            if (RepeatOnLifecycleKt.a(this.e, g.b.h, aVar, this) == mn) {
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
