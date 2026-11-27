package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Rx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\r\u0010\fJ7\u0010\u0011\u001a\u00020\u00062\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0013\u001a\u00020\u00062\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"LRx;", "THandler", "Lfs0;", "<init>", "()V", "handler", "", "set", "(Ljava/lang/Object;)V", "Lkotlin/Function1;", "callback", "fire", "(Lkotlin/jvm/functions/Function1;)V", "fireOnMain", "Lkotlin/Function2;", "LJM;", "", "suspendingFire", "(Lkotlin/jvm/functions/Function2;LJM;)Ljava/lang/Object;", "suspendingFireOnMain", "Ljava/lang/Object;", "", "getHasCallback", "()Z", "hasCallback", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class C1961Rx<THandler> implements InterfaceC3873fs0<THandler> {

    @Nullable
    private THandler callback;

    /* JADX INFO: renamed from: Rx$a */
    @InterfaceC3368dU(c = "com.onesignal.common.events.CallbackProducer$fireOnMain$1", f = "CallbackProducer.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "THandler"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a extends AW1 implements Function1<JM<? super Unit>, Object> {
        final /* synthetic */ Function1<THandler, Unit> $callback;
        int label;
        final /* synthetic */ C1961Rx<THandler> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C1961Rx<THandler> c1961Rx, Function1<? super THandler, Unit> function1, JM<? super a> jm) {
            super(1, jm);
            this.this$0 = c1961Rx;
            this.$callback = function1;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return new a(this.this$0, this.$callback, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable JM<? super Unit> jm) {
            return ((a) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            if (((C1961Rx) this.this$0).callback != null) {
                Function1<THandler, Unit> function1 = this.$callback;
                Object obj2 = ((C1961Rx) this.this$0).callback;
                Intrinsics.checkNotNull(obj2);
                function1.invoke((THandler) obj2);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: Rx$b, reason: from Kotlin metadata */
    @InterfaceC3368dU(c = "com.onesignal.common.events.CallbackProducer$suspendingFireOnMain$2", f = "CallbackProducer.kt", l = {75}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"THandler", "LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class THandler extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        final /* synthetic */ Function2<THandler, JM<? super Unit>, Object> $callback;
        int label;
        final /* synthetic */ C1961Rx<THandler> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public THandler(Function2<? super THandler, ? super JM<? super Unit>, ? extends Object> function2, C1961Rx<THandler> c1961Rx, JM<? super THandler> jm) {
            super(2, jm);
            this.$callback = function2;
            this.this$0 = c1961Rx;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return new THandler(this.$callback, this.this$0, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((THandler) create(kn, jm)).invokeSuspend(Unit.a);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to Rx$b for r3v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // defpackage.AbstractC7487wq
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
            /*
                r3 = this;
                MN r0 = defpackage.MN.d
                int r1 = r3.label
                r2 = 1
                if (r1 == 0) goto L15
                if (r1 != r2) goto Ld
                defpackage.C1795Pt1.b(r4)
                goto L2c
            Ld:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L15:
                defpackage.C1795Pt1.b(r4)
                kotlin.jvm.functions.Function2<THandler, JM<? super kotlin.Unit>, java.lang.Object> r4 = r3.$callback
                Rx<THandler> r1 = r3.this$0
                java.lang.Object r1 = defpackage.C1961Rx.access$getCallback$p(r1)
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                r3.label = r2
                java.lang.Object r4 = r4.invoke(r1, r3)
                if (r4 != r0) goto L2c
                return r0
            L2c:
                kotlin.Unit r4 = kotlin.Unit.a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C1961Rx.THandler.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void fire(@NotNull Function1<? super THandler, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        THandler thandler = this.callback;
        if (thandler != null) {
            Intrinsics.checkNotNull(thandler);
            callback.invoke(thandler);
        }
    }

    public final void fireOnMain(@NotNull Function1<? super THandler, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        LY1.suspendifyOnMain(new a(this, callback, null));
    }

    @Override // defpackage.InterfaceC3873fs0
    public boolean getHasCallback() {
        return this.callback != null;
    }

    @Override // defpackage.InterfaceC3873fs0
    public void set(@Nullable THandler handler) {
        this.callback = handler;
    }

    @Nullable
    public final Object suspendingFire(@NotNull Function2<? super THandler, ? super JM<? super Unit>, ? extends Object> function2, @NotNull JM<? super Unit> jm) {
        THandler thandler = this.callback;
        if (thandler == null) {
            return Unit.a;
        }
        Intrinsics.checkNotNull(thandler);
        Object objInvoke = function2.invoke(thandler, jm);
        return objInvoke == MN.d ? objInvoke : Unit.a;
    }

    @Nullable
    public final Object suspendingFireOnMain(@NotNull Function2<? super THandler, ? super JM<? super Unit>, ? extends Object> function2, @NotNull JM<? super Unit> jm) throws Throwable {
        if (this.callback == null) {
            return Unit.a;
        }
        RV rv = C6266r20.a;
        Object objP = C5189lv.p(QV0.a, new THandler(function2, this, null), jm);
        return objP == MN.d ? objP : Unit.a;
    }
}
