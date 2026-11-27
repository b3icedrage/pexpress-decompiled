package defpackage;

import io.sentry.android.core.b0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: nz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.trading.RobotSessionIdHolder$startNewSession$1", f = "RobotSessionIdHolder.kt", l = {59}, m = "invokeSuspend")
public final class C5626nz1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C5206lz1 g;
    public final /* synthetic */ String h;

    /* JADX INFO: renamed from: nz1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.trading.RobotSessionIdHolder$startNewSession$1$1$1", f = "RobotSessionIdHolder.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function1<JM<? super String>, Object> {
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, JM<? super a> jm) {
            super(1, jm);
            this.d = str;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return new a(this.d, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super String> jm) {
            return ((a) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return this.d;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5626nz1(C5206lz1 c5206lz1, String str, JM<? super C5626nz1> jm) {
        super(2, jm);
        this.g = c5206lz1;
        this.h = str;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        C5626nz1 c5626nz1 = new C5626nz1(this.g, this.h, jm);
        c5626nz1.e = obj;
        return c5626nz1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C5626nz1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        Object objA;
        MN mn = MN.d;
        int i = this.d;
        try {
            if (i == 0) {
                C1795Pt1.b(obj);
                C5206lz1 c5206lz1 = this.g;
                String str = this.h;
                C1717Ot1.a aVar = C1717Ot1.e;
                InterfaceC1442Lg1 interfaceC1442Lg1 = c5206lz1.a;
                C5206lz1.a aVar2 = C5206lz1.a.a;
                a aVar3 = new a(str, null);
                this.d = 1;
                obj = interfaceC1442Lg1.b(aVar2, aVar3, this);
                if (obj == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            objA = (InterfaceC4740jl2) obj;
            C1717Ot1.a aVar4 = C1717Ot1.e;
        } catch (Throwable th) {
            C1717Ot1.a aVar5 = C1717Ot1.e;
            objA = C1795Pt1.a(th);
        }
        Throwable thA = C1717Ot1.a(objA);
        if (thA != null) {
            b0.f("RobotSessionIdHolder", "Failed to persist robot session id", thA);
        }
        return Unit.a;
    }
}
