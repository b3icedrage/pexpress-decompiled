package defpackage;

import android.content.res.Resources;
import android.view.ViewGroup;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.robot.robot.common.screens.RobotCommonFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;

/* JADX INFO: renamed from: Gv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.common.screens.RobotCommonFragment$initAllViews$lambda$8$$inlined$launchAndCollectIn$1", f = "RobotCommonFragment.kt", l = {48}, m = "invokeSuspend")
public final class C1097Gv1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ C4733jk g;
    public final /* synthetic */ RobotCommonFragment h;
    public final /* synthetic */ ViewGroup i;
    public final /* synthetic */ Integer j;

    /* JADX INFO: renamed from: Gv1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.common.screens.RobotCommonFragment$initAllViews$lambda$8$$inlined$launchAndCollectIn$1$1", f = "RobotCommonFragment.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ C4733jk g;
        public final /* synthetic */ RobotCommonFragment h;
        public final /* synthetic */ ViewGroup i;
        public final /* synthetic */ Integer j;

        /* JADX INFO: renamed from: Gv1$a$a, reason: collision with other inner class name */
        public static final class C0039a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ RobotCommonFragment e;
            public final /* synthetic */ ViewGroup g;
            public final /* synthetic */ Integer h;

            public C0039a(KN kn, RobotCommonFragment robotCommonFragment, ViewGroup viewGroup, Integer num) {
                this.e = robotCommonFragment;
                this.g = viewGroup;
                this.h = num;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj2 = this.e.i;
                Intrinsics.checkNotNull(obj2);
                b bVar = (b) ((C1486Lv1) obj2).p.d.getValue();
                Integer num = this.h;
                ViewGroup viewGroup = this.g;
                if (bVar == null) {
                    Resources resources = viewGroup.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    C7644xc.b(viewGroup, zBooleanValue, num, C7644xc.i(resources));
                } else {
                    C7644xc.b(viewGroup, zBooleanValue, num, bVar.d);
                }
                b.a aVar = b.e;
                Object objC = IW.c(c.g(1, R40.SECONDS), jm);
                return objC == MN.d ? objC : Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C4733jk c4733jk, JM jm, RobotCommonFragment robotCommonFragment, ViewGroup viewGroup, Integer num) {
            super(2, jm);
            this.g = c4733jk;
            this.h = robotCommonFragment;
            this.i = viewGroup;
            this.j = num;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = new a(this.g, jm, this.h, this.i, this.j);
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
                C0039a c0039a = new C0039a((KN) this.e, this.h, this.i, this.j);
                this.d = 1;
                if (this.g.c(c0039a, this) == mn) {
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
    public C1097Gv1(FP0 fp0, C4733jk c4733jk, JM jm, RobotCommonFragment robotCommonFragment, ViewGroup viewGroup, Integer num) {
        super(2, jm);
        this.e = fp0;
        this.g = c4733jk;
        this.h = robotCommonFragment;
        this.i = viewGroup;
        this.j = num;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C1097Gv1(this.e, this.g, jm, this.h, this.i, this.j);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C1097Gv1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            a aVar = new a(this.g, null, this.h, this.i, this.j);
            this.d = 1;
            if (RepeatOnLifecycleKt.a(this.e, g.b.g, aVar, this) == mn) {
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
