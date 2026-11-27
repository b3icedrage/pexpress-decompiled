package defpackage;

import androidx.fragment.app.g;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.base.feature.stories.screens.full.FullStoriesFragmentBase;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.stories.screens.full.FullStoriesFragmentBase$setupListeners$lambda$6$$inlined$launchAndCollectIn$default$1", f = "FullStoriesFragmentBase.kt", l = {48}, m = "invokeSuspend")
public final class C4940kj0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ InterfaceC6396rf0 g;
    public final /* synthetic */ FullStoriesFragmentBase h;

    /* JADX INFO: renamed from: kj0$a */
    @InterfaceC3368dU(c = "com.base.feature.stories.screens.full.FullStoriesFragmentBase$setupListeners$lambda$6$$inlined$launchAndCollectIn$default$1$1", f = "FullStoriesFragmentBase.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ InterfaceC6396rf0 g;
        public final /* synthetic */ FullStoriesFragmentBase h;

        /* JADX INFO: renamed from: kj0$a$a, reason: collision with other inner class name */
        public static final class C0429a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ FullStoriesFragmentBase e;

            public C0429a(KN kn, FullStoriesFragmentBase fullStoriesFragmentBase) {
                this.e = fullStoriesFragmentBase;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                FullStoriesFragmentBase fullStoriesFragmentBase = this.e;
                Intrinsics.checkNotNullParameter(fullStoriesFragmentBase, "<this>");
                g gVarRequireActivity = fullStoriesFragmentBase.requireActivity();
                Intrinsics.checkNotNullExpressionValue(gVarRequireActivity, "requireActivity(...)");
                if (!(gVarRequireActivity instanceof ActivityC1745Pd)) {
                    throw new IllegalStateException("Fragment activity is not instance of AppCompatActivity");
                }
                ((ActivityC1745Pd) gVarRequireActivity).getOnBackPressedDispatcher().c();
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC6396rf0 interfaceC6396rf0, JM jm, FullStoriesFragmentBase fullStoriesFragmentBase) {
            super(2, jm);
            this.g = interfaceC6396rf0;
            this.h = fullStoriesFragmentBase;
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
                C0429a c0429a = new C0429a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0429a, this) == mn) {
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
    public C4940kj0(FP0 fp0, InterfaceC6396rf0 interfaceC6396rf0, JM jm, FullStoriesFragmentBase fullStoriesFragmentBase) {
        super(2, jm);
        this.e = fp0;
        this.g = interfaceC6396rf0;
        this.h = fullStoriesFragmentBase;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C4940kj0(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C4940kj0) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            a aVar = new a(this.g, null, this.h);
            this.d = 1;
            if (RepeatOnLifecycleKt.a(this.e, androidx.lifecycle.g.b.h, aVar, this) == mn) {
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
