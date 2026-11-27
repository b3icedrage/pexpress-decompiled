package defpackage;

import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: oV0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.app.activities.main.MainActivity$initBottomNavigationAbTestState$$inlined$launchAndCollectIn$default$1", f = "MainActivity.kt", l = {48}, m = "invokeSuspend")
public final class C5732oV0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ InterfaceC6396rf0 g;
    public final /* synthetic */ ActivityC6781tV0 h;

    /* JADX INFO: renamed from: oV0$a */
    @InterfaceC3368dU(c = "com.base.app.activities.main.MainActivity$initBottomNavigationAbTestState$$inlined$launchAndCollectIn$default$1$1", f = "MainActivity.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ InterfaceC6396rf0 g;
        public final /* synthetic */ ActivityC6781tV0 h;

        /* JADX INFO: renamed from: oV0$a$a, reason: collision with other inner class name */
        public static final class C0466a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ ActivityC6781tV0 e;

            public C0466a(KN kn, ActivityC6781tV0 activityC6781tV0) {
                this.e = activityC6781tV0;
                this.d = kn;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.InterfaceC6606sf0
            public final Object a(T t, JM<? super Unit> jm) {
                boolean zBooleanValue = ((Boolean) t).booleanValue();
                C3086c7 c3086c7 = this.e.H;
                Intrinsics.checkNotNull(c3086c7);
                c3086c7.e.getMenu().findItem(R.id.main_support_fragment).setVisible(zBooleanValue);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC6396rf0 interfaceC6396rf0, JM jm, ActivityC6781tV0 activityC6781tV0) {
            super(2, jm);
            this.g = interfaceC6396rf0;
            this.h = activityC6781tV0;
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
                C0466a c0466a = new C0466a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0466a, this) == mn) {
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
    public C5732oV0(FP0 fp0, InterfaceC6396rf0 interfaceC6396rf0, JM jm, ActivityC6781tV0 activityC6781tV0) {
        super(2, jm);
        this.e = fp0;
        this.g = interfaceC6396rf0;
        this.h = activityC6781tV0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C5732oV0(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C5732oV0) create(kn, jm)).invokeSuspend(Unit.a);
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
