package defpackage;

import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.account.screens.maininfo.AccountMainInfoPartBase;
import com.google.android.material.imageview.ShapeableImageView;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.account.screens.maininfo.AccountMainInfoPartBase$initFlowCollectors$lambda$6$$inlined$launchAndCollectIn$default$3", f = "AccountMainInfoPartBase.kt", l = {48}, m = "invokeSuspend")
public final class H3 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ InterfaceC6396rf0 g;
    public final /* synthetic */ AccountMainInfoPartBase h;

    @InterfaceC3368dU(c = "com.base.feature.account.screens.maininfo.AccountMainInfoPartBase$initFlowCollectors$lambda$6$$inlined$launchAndCollectIn$default$3$1", f = "AccountMainInfoPartBase.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ InterfaceC6396rf0 g;
        public final /* synthetic */ AccountMainInfoPartBase h;

        /* JADX INFO: renamed from: H3$a$a, reason: collision with other inner class name */
        public static final class C0042a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ AccountMainInfoPartBase e;

            public C0042a(KN kn, AccountMainInfoPartBase accountMainInfoPartBase) {
                this.e = accountMainInfoPartBase;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                ShapeableImageView accountMainInfoAvatarImage = ((J3) this.e.k()).g;
                Intrinsics.checkNotNullExpressionValue(accountMainInfoAvatarImage, "accountMainInfoAvatarImage");
                C3435dm0.h(accountMainInfoAvatarImage, (String) obj, R.drawable.ic_account_avatar_placeholder);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC6396rf0 interfaceC6396rf0, JM jm, AccountMainInfoPartBase accountMainInfoPartBase) {
            super(2, jm);
            this.g = interfaceC6396rf0;
            this.h = accountMainInfoPartBase;
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
                C0042a c0042a = new C0042a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0042a, this) == mn) {
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
    public H3(FP0 fp0, InterfaceC6396rf0 interfaceC6396rf0, JM jm, AccountMainInfoPartBase accountMainInfoPartBase) {
        super(2, jm);
        this.e = fp0;
        this.g = interfaceC6396rf0;
        this.h = accountMainInfoPartBase;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new H3(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((H3) create(kn, jm)).invokeSuspend(Unit.a);
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
