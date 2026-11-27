package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yV0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.app.activities.main.MainActivity$startListenForLanguageChanges$1", f = "MainActivity.kt", l = {396}, m = "invokeSuspend")
public final class C7832yV0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ ActivityC6781tV0 e;

    /* JADX INFO: renamed from: yV0$a */
    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ ActivityC6781tV0 d;

        public a(ActivityC6781tV0 activityC6781tV0) {
            this.d = activityC6781tV0;
        }

        @Override // defpackage.InterfaceC6606sf0
        public final Object a(Object obj, JM jm) {
            ActivityC6781tV0 activityC6781tV0 = this.d;
            activityC6781tV0.getViewModelStore().a();
            activityC6781tV0.I = true;
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7832yV0(ActivityC6781tV0 activityC6781tV0, JM<? super C7832yV0> jm) {
        super(2, jm);
        this.e = activityC6781tV0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C7832yV0(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        ((C7832yV0) create(kn, jm)).invokeSuspend(Unit.a);
        return MN.d;
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            ActivityC6781tV0 activityC6781tV0 = this.e;
            C4612j90 c4612j90 = activityC6781tV0.o;
            if (c4612j90 == null) {
                Intrinsics.l("events");
                throw null;
            }
            a aVar = new a(activityC6781tV0);
            this.d = 1;
            if (c4612j90.E.d.c(aVar, this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        throw new C3342dL0();
    }
}
