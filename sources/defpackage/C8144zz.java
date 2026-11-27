package defpackage;

import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.changelanguage.screens.changelanguage.ChangeLanguageFragmentAbstract$initRecycler$lambda$1$$inlined$launchAndCollectIn$1", f = "ChangeLanguageFragmentAbstract.kt", l = {48}, m = "invokeSuspend")
public final class C8144zz extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ C6610sg0 g;
    public final /* synthetic */ C7514wz h;

    /* JADX INFO: renamed from: zz$a */
    @InterfaceC3368dU(c = "com.base.feature.changelanguage.screens.changelanguage.ChangeLanguageFragmentAbstract$initRecycler$lambda$1$$inlined$launchAndCollectIn$1$1", f = "ChangeLanguageFragmentAbstract.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ C6610sg0 g;
        public final /* synthetic */ C7514wz h;

        /* JADX INFO: renamed from: zz$a$a, reason: collision with other inner class name */
        public static final class C0563a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ C7514wz e;

            public C0563a(KN kn, C7514wz c7514wz) {
                this.e = c7514wz;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                List<UL0> list = (List) obj;
                C7514wz c7514wz = this.e;
                c7514wz.getClass();
                Intrinsics.checkNotNullParameter(list, "list");
                c7514wz.g.b(list);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C6610sg0 c6610sg0, JM jm, C7514wz c7514wz) {
            super(2, jm);
            this.g = c6610sg0;
            this.h = c7514wz;
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
                C0563a c0563a = new C0563a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0563a, this) == mn) {
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
    public C8144zz(FP0 fp0, C6610sg0 c6610sg0, JM jm, C7514wz c7514wz) {
        super(2, jm);
        this.e = fp0;
        this.g = c6610sg0;
        this.h = c7514wz;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C8144zz(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C8144zz) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            a aVar = new a(this.g, null, this.h);
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
