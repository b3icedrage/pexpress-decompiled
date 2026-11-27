package defpackage;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.g;
import com.base.feature.platform.screens.deposit.DepositFragmentBase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ii2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.platform.utils.WebViewPreloadingUpdater$start$2", f = "WebViewPreloadingUpdater.kt", l = {55}, m = "invokeSuspend")
public final class C4469ii2 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C4728ji2 g;

    /* JADX INFO: renamed from: ii2$a */
    @InterfaceC3368dU(c = "com.base.feature.platform.utils.WebViewPreloadingUpdater$start$2$1", f = "WebViewPreloadingUpdater.kt", l = {46}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ C4728ji2 e;

        /* JADX INFO: renamed from: ii2$a$a, reason: collision with other inner class name */
        public static final class C0378a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C4728ji2 d;

            public C0378a(C4728ji2 c4728ji2) {
                this.d = c4728ji2;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                ((Boolean) obj).booleanValue();
                this.d.a.h();
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C4728ji2 c4728ji2, JM<? super a> jm) {
            super(2, jm);
            this.e = c4728ji2;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new a(this.e, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            Object obj2 = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C4728ji2 c4728ji2 = this.e;
                InterfaceC6396rf0<Boolean> interfaceC6396rf0D = c4728ji2.h.d();
                C0378a c0378a = new C0378a(c4728ji2);
                this.d = 1;
                Object objC = interfaceC6396rf0D.c(new C1515Mf0(c0378a, new C2590Zo1()), this);
                if (objC != MN.d) {
                    objC = Unit.a;
                }
                if (objC == obj2) {
                    return obj2;
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

    /* JADX INFO: renamed from: ii2$b */
    public static final class b<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ C4728ji2 d;

        public b(C4728ji2 c4728ji2) {
            this.d = c4728ji2;
        }

        @Override // defpackage.InterfaceC6606sf0
        public final Object a(Object obj, JM<? super Unit> jm) {
            g lifecycle;
            g.b bVarB;
            C4728ji2 c4728ji2 = this.d;
            Object obj2 = c4728ji2.f;
            FP0 fp0 = obj2 instanceof FP0 ? (FP0) obj2 : null;
            if (fp0 != null && (lifecycle = fp0.getLifecycle()) != null && (bVarB = lifecycle.b()) != null) {
                Intrinsics.c(obj2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                List<Fragment> listF = ((androidx.fragment.app.g) obj2).getSupportFragmentManager().c.f();
                Intrinsics.checkNotNullExpressionValue(listF, "getFragments(...)");
                ArrayList arrayList = new ArrayList();
                for (T t : listF) {
                    if (t instanceof DepositFragmentBase) {
                        arrayList.add(t);
                    }
                }
                boolean zIsEmpty = arrayList.isEmpty();
                if (c4728ji2.d.f.getValue() != null && bVarB.b(g.b.g) && zIsEmpty) {
                    Pa2 pa2 = c4728ji2.e;
                    String strZ = pa2.z();
                    boolean zA = Intrinsics.a(strZ, c4728ji2.i);
                    boolean z = !zA;
                    if (!zA) {
                        c4728ji2.i = strZ;
                    }
                    c4728ji2.a.k(pa2.z(), z);
                }
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4469ii2(C4728ji2 c4728ji2, JM<? super C4469ii2> jm) {
        super(2, jm);
        this.g = c4728ji2;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        C4469ii2 c4469ii2 = new C4469ii2(this.g, jm);
        c4469ii2.e = obj;
        return c4469ii2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C4469ii2) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            KN kn = (KN) this.e;
            C4728ji2 c4728ji2 = this.g;
            C5189lv.k(kn, null, new a(c4728ji2, null), 3);
            C3098cA c3098cAX = C4466ii.x(c4728ji2.b.k(), c4728ji2.c.k(), c4728ji2.g.a());
            boolean z = c3098cAX instanceof InterfaceC6460ry;
            InterfaceC6396rf0 c6670sy = c3098cAX;
            if (!z) {
                c6670sy = new C6670sy(c3098cAX);
            }
            b bVar = new b(c4728ji2);
            this.d = 1;
            if (c6670sy.c(bVar, this) == mn) {
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
