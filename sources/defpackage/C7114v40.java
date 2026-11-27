package defpackage;

import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.api.core.backend.domain.models.requestModels.DuoAuthType;
import com.base.feature.registration.screens.duoauth.DuoAuthFragmentBase;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: v40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.registration.screens.duoauth.DuoAuthFragmentBase$initFlowCollectors$lambda$9$$inlined$launchAndCollectIn$default$3", f = "DuoAuthFragmentBase.kt", l = {48}, m = "invokeSuspend")
public final class C7114v40 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ InterfaceC6396rf0 g;
    public final /* synthetic */ DuoAuthFragmentBase h;

    /* JADX INFO: renamed from: v40$a */
    @InterfaceC3368dU(c = "com.base.feature.registration.screens.duoauth.DuoAuthFragmentBase$initFlowCollectors$lambda$9$$inlined$launchAndCollectIn$default$3$1", f = "DuoAuthFragmentBase.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ InterfaceC6396rf0 g;
        public final /* synthetic */ DuoAuthFragmentBase h;

        /* JADX INFO: renamed from: v40$a$a, reason: collision with other inner class name */
        public static final class C0511a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ DuoAuthFragmentBase e;

            public C0511a(KN kn, DuoAuthFragmentBase duoAuthFragmentBase) {
                this.e = duoAuthFragmentBase;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                String string;
                int i = DuoAuthFragmentBase.a.a[((DuoAuthType) obj).ordinal()];
                DuoAuthFragmentBase duoAuthFragmentBase = this.e;
                switch (i) {
                    case 1:
                        return Unit.a;
                    case 2:
                        string = duoAuthFragmentBase.getString(R.string.duo_fa_phone_number_email);
                        break;
                    case 3:
                        string = duoAuthFragmentBase.getString(R.string.duo_fa_phone_number_text);
                        break;
                    case 4:
                        string = duoAuthFragmentBase.getString(R.string.duofa_email_description);
                        break;
                    case 5:
                        string = duoAuthFragmentBase.getString(R.string.duofa_push_description);
                        break;
                    case 6:
                        string = duoAuthFragmentBase.getString(R.string.duo_fa_phone_number_email_facebook);
                        break;
                    default:
                        throw new C6489s51();
                }
                Intrinsics.checkNotNull(string);
                duoAuthFragmentBase.j.o().setText(string);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC6396rf0 interfaceC6396rf0, JM jm, DuoAuthFragmentBase duoAuthFragmentBase) {
            super(2, jm);
            this.g = interfaceC6396rf0;
            this.h = duoAuthFragmentBase;
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
                C0511a c0511a = new C0511a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0511a, this) == mn) {
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
    public C7114v40(FP0 fp0, InterfaceC6396rf0 interfaceC6396rf0, JM jm, DuoAuthFragmentBase duoAuthFragmentBase) {
        super(2, jm);
        this.e = fp0;
        this.g = interfaceC6396rf0;
        this.h = duoAuthFragmentBase;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C7114v40(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C7114v40) create(kn, jm)).invokeSuspend(Unit.a);
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
