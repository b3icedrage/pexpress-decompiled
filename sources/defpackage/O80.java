package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u00062\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\u00062\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0004\b\u0011\u0010\u0010J7\u0010\u0015\u001a\u00020\u00062\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u0017\u001a\u00020\u00062\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"LO80;", "THandler", "LCs0;", "<init>", "()V", "handler", "", "subscribe", "(Ljava/lang/Object;)V", "unsubscribe", "from", "subscribeAll", "(LO80;)V", "Lkotlin/Function1;", "callback", "fire", "(Lkotlin/jvm/functions/Function1;)V", "fireOnMain", "Lkotlin/Function2;", "LJM;", "", "suspendingFire", "(Lkotlin/jvm/functions/Function2;LJM;)Ljava/lang/Object;", "suspendingFireOnMain", "", "subscribers", "Ljava/util/List;", "", "getHasSubscribers", "()Z", "hasSubscribers", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class O80<THandler> implements InterfaceC0775Cs0<THandler> {

    @NotNull
    private final List<THandler> subscribers;

    @InterfaceC3368dU(c = "com.onesignal.common.events.EventProducer$fireOnMain$1", f = "EventProducer.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "THandler"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a extends AW1 implements Function1<JM<? super Unit>, Object> {
        final /* synthetic */ Function1<THandler, Unit> $callback;
        int label;
        final /* synthetic */ O80<THandler> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(O80<THandler> o80, Function1<? super THandler, Unit> function1, JM<? super a> jm) {
            super(1, jm);
            this.this$0 = o80;
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
            List listE0;
            MN mn = MN.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            List list = ((O80) this.this$0).subscribers;
            O80<THandler> o80 = this.this$0;
            synchronized (list) {
                listE0 = CollectionsKt.e0(((O80) o80).subscribers);
            }
            Iterator it = listE0.iterator();
            while (it.hasNext()) {
                this.$callback.invoke((THandler) it.next());
            }
            return Unit.a;
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.common.events.EventProducer", f = "EventProducer.kt", l = {79}, m = "suspendingFire")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b extends LM {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ O80<THandler> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(O80<THandler> o80, JM<? super b> jm) {
            super(jm);
            this.this$0 = o80;
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.suspendingFire(null, this);
        }
    }

    /* JADX INFO: renamed from: O80$c, reason: from Kotlin metadata */
    @InterfaceC3368dU(c = "com.onesignal.common.events.EventProducer$suspendingFireOnMain$2", f = "EventProducer.kt", l = {93}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"THandler", "LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class THandler extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        final /* synthetic */ Function2<THandler, JM<? super Unit>, Object> $callback;
        Object L$0;
        int label;
        final /* synthetic */ O80<THandler> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public THandler(O80<THandler> o80, Function2<? super THandler, ? super JM<? super Unit>, ? extends Object> function2, JM<? super THandler> jm) {
            super(2, jm);
            this.this$0 = o80;
            this.$callback = function2;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return new THandler(this.this$0, this.$callback, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((THandler) create(kn, jm)).invokeSuspend(Unit.a);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to O80$c for r4v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // defpackage.AbstractC7487wq
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
            /*
                r4 = this;
                MN r0 = defpackage.MN.d
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L19
                if (r1 != r2) goto L11
                java.lang.Object r1 = r4.L$0
                java.util.Iterator r1 = (java.util.Iterator) r1
                defpackage.C1795Pt1.b(r5)
                goto L33
            L11:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L19:
                defpackage.C1795Pt1.b(r5)
                O80<THandler> r5 = r4.this$0
                java.util.List r5 = defpackage.O80.access$getSubscribers$p(r5)
                O80<THandler> r1 = r4.this$0
                monitor-enter(r5)
                java.util.List r1 = defpackage.O80.access$getSubscribers$p(r1)     // Catch: java.lang.Throwable -> L4d
                java.util.List r1 = kotlin.collections.CollectionsKt.e0(r1)     // Catch: java.lang.Throwable -> L4d
                monitor-exit(r5)
                java.util.Iterator r5 = r1.iterator()
                r1 = r5
            L33:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L4a
                java.lang.Object r5 = r1.next()
                kotlin.jvm.functions.Function2<THandler, JM<? super kotlin.Unit>, java.lang.Object> r3 = r4.$callback
                r4.L$0 = r1
                r4.label = r2
                java.lang.Object r5 = r3.invoke(r5, r4)
                if (r5 != r0) goto L33
                return r0
            L4a:
                kotlin.Unit r5 = kotlin.Unit.a
                return r5
            L4d:
                r0 = move-exception
                monitor-exit(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.O80.THandler.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public O80() {
        List<THandler> listSynchronizedList = Collections.synchronizedList(new ArrayList());
        Intrinsics.checkNotNullExpressionValue(listSynchronizedList, "synchronizedList(mutableListOf())");
        this.subscribers = listSynchronizedList;
    }

    public final void fire(@NotNull Function1<? super THandler, Unit> callback) {
        List listE0;
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.subscribers) {
            listE0 = CollectionsKt.e0(this.subscribers);
        }
        Iterator it = listE0.iterator();
        while (it.hasNext()) {
            callback.invoke((Object) it.next());
        }
    }

    public final void fireOnMain(@NotNull Function1<? super THandler, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        LY1.suspendifyOnMain(new a(this, callback, null));
    }

    @Override // defpackage.InterfaceC0775Cs0
    public boolean getHasSubscribers() {
        List<THandler> list = this.subscribers;
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list != null ? !list.isEmpty() : list.iterator().hasNext();
    }

    @Override // defpackage.InterfaceC0775Cs0
    public void subscribe(THandler handler) {
        synchronized (this.subscribers) {
            this.subscribers.add(handler);
        }
    }

    public final void subscribeAll(@NotNull O80<THandler> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        synchronized (this.subscribers) {
            try {
                Iterator<THandler> it = from.subscribers.iterator();
                while (it.hasNext()) {
                    subscribe(it.next());
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object suspendingFire(@NotNull Function2<? super THandler, ? super JM<? super Unit>, ? extends Object> function2, @NotNull JM<? super Unit> jm) {
        b bVar;
        List listE0;
        Function2<? super THandler, ? super JM<? super Unit>, ? extends Object> function3;
        Iterator it;
        if (jm instanceof b) {
            bVar = (b) jm;
            int i = bVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.label = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, jm);
            }
        } else {
            bVar = new b(this, jm);
        }
        Object obj = bVar.result;
        MN mn = MN.d;
        int i2 = bVar.label;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            synchronized (this.subscribers) {
                listE0 = CollectionsKt.e0(this.subscribers);
            }
            function3 = function2;
            it = listE0.iterator();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) bVar.L$1;
            Function2<? super THandler, ? super JM<? super Unit>, ? extends Object> function4 = (Function2) bVar.L$0;
            C1795Pt1.b(obj);
            function3 = function4;
        }
        while (it.hasNext()) {
            A2 a2 = (Object) it.next();
            bVar.L$0 = function3;
            bVar.L$1 = it;
            bVar.label = 1;
            if (function3.invoke(a2, bVar) == mn) {
                return mn;
            }
        }
        return Unit.a;
    }

    @Nullable
    public final Object suspendingFireOnMain(@NotNull Function2<? super THandler, ? super JM<? super Unit>, ? extends Object> function2, @NotNull JM<? super Unit> jm) throws Throwable {
        RV rv = C6266r20.a;
        Object objP = C5189lv.p(QV0.a, new THandler(this, function2, null), jm);
        return objP == MN.d ? objP : Unit.a;
    }

    @Override // defpackage.InterfaceC0775Cs0
    public void unsubscribe(THandler handler) {
        synchronized (this.subscribers) {
            this.subscribers.remove(handler);
        }
    }
}
