package defpackage;

import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.stories.screens.full.FullStoriesFragmentBase;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.stories.screens.full.FullStoriesFragmentBase$setupListeners$lambda$6$$inlined$launchAndCollectIn$default$2", f = "FullStoriesFragmentBase.kt", l = {48}, m = "invokeSuspend")
public final class C5150lj0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ FP1 g;
    public final /* synthetic */ FullStoriesFragmentBase h;

    /* JADX INFO: renamed from: lj0$a */
    @InterfaceC3368dU(c = "com.base.feature.stories.screens.full.FullStoriesFragmentBase$setupListeners$lambda$6$$inlined$launchAndCollectIn$default$2$1", f = "FullStoriesFragmentBase.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ FP1 g;
        public final /* synthetic */ FullStoriesFragmentBase h;

        /* JADX INFO: renamed from: lj0$a$a, reason: collision with other inner class name */
        public static final class C0438a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ FullStoriesFragmentBase e;

            public C0438a(KN kn, FullStoriesFragmentBase fullStoriesFragmentBase) {
                this.e = fullStoriesFragmentBase;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                this.e.k().e.c(((Number) obj).intValue(), true);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FP1 fp1, JM jm, FullStoriesFragmentBase fullStoriesFragmentBase) {
            super(2, jm);
            this.g = fp1;
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
                C0438a c0438a = new C0438a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0438a, this) == mn) {
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
    public C5150lj0(FP0 fp0, FP1 fp1, JM jm, FullStoriesFragmentBase fullStoriesFragmentBase) {
        super(2, jm);
        this.e = fp0;
        this.g = fp1;
        this.h = fullStoriesFragmentBase;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C5150lj0(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C5150lj0) create(kn, jm)).invokeSuspend(Unit.a);
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
