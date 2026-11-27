package defpackage;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0002`aB5\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u0017H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u0017H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001bJ\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\u0006\u0010\u001d\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020\u0017H\u0096@ø\u0001\u0000¢\u0006\u0004\b \u0010\u001bJ'\u0010%\u001a\u00020\u0012\"\b\b\u0000\u0010\"*\u00020!2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0017H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020\u00172\u0006\u0010)\u001a\u00020!2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b*\u0010+J#\u0010,\u001a\u00020\u00122\u0006\u0010)\u001a\u00020!2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0017H\u0016¢\u0006\u0004\b.\u0010(J!\u00102\u001a\u00020\u00172\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b0\u00101J%\u00105\u001a\u00020\u00172\u0006\u00103\u001a\u00020\u00152\b\u00104\u001a\u0004\u0018\u00010\u0015H\u0086@ø\u0001\u0000¢\u0006\u0004\b5\u00106J\u001b\u00109\u001a\u00020\u00172\u0006\u00108\u001a\u000207H\u0086@ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u001f\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00032\u0006\u0010;\u001a\u00020\u0015H\u0000¢\u0006\u0004\b<\u0010=J\u000f\u0010@\u001a\u00020\u0017H\u0000¢\u0006\u0004\b?\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010AR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010BR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010CR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010DR \u0010G\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\u00040E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR \u0010J\u001a\b\u0012\u0004\u0012\u00020\u00100I8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020O0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020O0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010QR\u0016\u0010S\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010V\u001a\u00020U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00170X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010[\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010_\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006b"}, d2 = {"LT91;", "Lfu0;", "LYu0;", "", "Leu0;", "executors", "LS91;", "_operationModelStore", "LxI;", "_configModelStore", "Lgv0;", "_time", "Lx41;", "_newRecordState", "<init>", "(Ljava/util/List;LS91;LxI;Lgv0;Lx41;)V", "LT91$b;", "queueItem", "", "flush", "addToStore", "", "index", "", "internalEnqueue", "(LT91$b;ZZLjava/lang/Integer;)V", "processQueueForever", "(LJM;)Ljava/lang/Object;", "waitForNewOperationAndExecutionInterval", "startingOp", "getGroupableOperations", "(LT91$b;)Ljava/util/List;", "awaitInitialized", "LQ91;", "T", "LRI0;", "type", "containsInstanceOf", "(LRI0;)Z", "start", "()V", "operation", "enqueue", "(LQ91;Z)V", "enqueueAndWait", "(LQ91;ZLJM;)Ljava/lang/Object;", "forceExecuteOperations", "ops", "executeOperations$com_onesignal_core", "(Ljava/util/List;LJM;)Ljava/lang/Object;", "executeOperations", "retries", "retryAfterSeconds", "delayBeforeNextExecution", "(ILjava/lang/Integer;LJM;)Ljava/lang/Object;", "", "postCreateDelay", "delayForPostCreate", "(JLJM;)Ljava/lang/Object;", "bucketFilter", "getNextOps$com_onesignal_core", "(I)Ljava/util/List;", "getNextOps", "loadSavedOperations$com_onesignal_core", "loadSavedOperations", "LS91;", "LxI;", "Lgv0;", "Lx41;", "", "", "executorsMap", "Ljava/util/Map;", "", "queue", "Ljava/util/List;", "getQueue$com_onesignal_core", "()Ljava/util/List;", "Lzf2;", "LT91$a;", "waiter", "Lzf2;", "retryWaiter", "paused", "Z", "LKN;", "coroutineScope", "LKN;", "LCG;", "initialized", "LCG;", "enqueueIntoBucket", "I", "getExecuteBucket", "()I", "executeBucket", R51.PUSH_ADDITIONAL_DATA_KEY, "b", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class T91 implements InterfaceC3879fu0, InterfaceC2529Yu0 {

    @NotNull
    private final C7582xI _configModelStore;

    @NotNull
    private final C7536x41 _newRecordState;

    @NotNull
    private final S91 _operationModelStore;

    @NotNull
    private final InterfaceC4092gv0 _time;

    @NotNull
    private KN coroutineScope;
    private int enqueueIntoBucket;

    @NotNull
    private final Map<String, InterfaceC3669eu0> executorsMap;

    @NotNull
    private final CG<Unit> initialized;
    private boolean paused;

    @NotNull
    private final List<b> queue;

    @NotNull
    private final C8079zf2<a> retryWaiter;

    @NotNull
    private final C8079zf2<a> waiter;

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[U90.values().length];
            iArr[U90.SUCCESS.ordinal()] = 1;
            iArr[U90.FAIL_UNAUTHORIZED.ordinal()] = 2;
            iArr[U90.FAIL_NORETRY.ordinal()] = 3;
            iArr[U90.FAIL_CONFLICT.ordinal()] = 4;
            iArr[U90.SUCCESS_STARTING_ONLY.ordinal()] = 5;
            iArr[U90.FAIL_RETRY.ordinal()] = 6;
            iArr[U90.FAIL_PAUSE_OPREPO.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.core.internal.operations.impl.OperationRepo$delayBeforeNextExecution$2", f = "OperationRepo.kt", l = {346}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "LT91$a;", "<anonymous>", "(LKN;)LT91$a;"}, k = 3, mv = {1, 7, 1})
    public static final class d extends AW1 implements Function2<KN, JM<? super a>, Object> {
        int label;

        public d(JM<? super d> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return T91.this.new d(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super a> jm) {
            return ((d) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
                return obj;
            }
            C1795Pt1.b(obj);
            C8079zf2 c8079zf2 = T91.this.retryWaiter;
            this.label = 1;
            Object objWaitForWake = c8079zf2.waitForWake(this);
            return objWaitForWake == mn ? mn : objWaitForWake;
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.core.internal.operations.impl.OperationRepo", f = "OperationRepo.kt", l = {360}, m = "delayForPostCreate")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class e extends LM {
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public e(JM<? super e> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return T91.this.delayForPostCreate(0L, this);
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.core.internal.operations.impl.OperationRepo$enqueue$1", f = "OperationRepo.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class f extends AW1 implements Function1<JM<? super Unit>, Object> {
        final /* synthetic */ boolean $flush;
        final /* synthetic */ Q91 $operation;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Q91 q91, boolean z, JM<? super f> jm) {
            super(1, jm);
            this.$operation = q91;
            this.$flush = z;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return T91.this.new f(this.$operation, this.$flush, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable JM<? super Unit> jm) {
            return ((f) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            T91 t91 = T91.this;
            T91.internalEnqueue$default(t91, new b(this.$operation, null, t91.enqueueIntoBucket, 0, 10, null), this.$flush, true, null, 8, null);
            return Unit.a;
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.core.internal.operations.impl.OperationRepo", f = "OperationRepo.kt", l = {242, 318, 320}, m = "executeOperations$com_onesignal_core")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class g extends LM {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public g(JM<? super g> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return T91.this.executeOperations$com_onesignal_core(null, this);
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.core.internal.operations.impl.OperationRepo", f = "OperationRepo.kt", l = {174, 186, 189, 191}, m = "processQueueForever")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class h extends LM {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public h(JM<? super h> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return T91.this.processQueueForever(this);
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.core.internal.operations.impl.OperationRepo$start$1", f = "OperationRepo.kt", l = {102}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class i extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        int label;

        public i(JM<? super i> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return T91.this.new i(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((i) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.label;
            if (i == 0) {
                C1795Pt1.b(obj);
                T91.this.loadSavedOperations$com_onesignal_core();
                T91 t91 = T91.this;
                this.label = 1;
                if (t91.processQueueForever(this) == mn) {
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

    @InterfaceC3368dU(c = "com.onesignal.core.internal.operations.impl.OperationRepo", f = "OperationRepo.kt", l = {218, 226}, m = "waitForNewOperationAndExecutionInterval")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class j extends LM {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public j(JM<? super j> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return T91.this.waitForNewOperationAndExecutionInterval(this);
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.core.internal.operations.impl.OperationRepo$waitForNewOperationAndExecutionInterval$waitedTheFullTime$1", f = "OperationRepo.kt", l = {227}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class k extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        final /* synthetic */ C3027bp1<a> $wakeMessage;
        Object L$0;
        int label;
        final /* synthetic */ T91 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(C3027bp1<a> c3027bp1, T91 t91, JM<? super k> jm) {
            super(2, jm);
            this.$wakeMessage = c3027bp1;
            this.this$0 = t91;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return new k(this.$wakeMessage, this.this$0, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((k) create(kn, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            C3027bp1<a> c3027bp1;
            T t;
            MN mn = MN.d;
            int i = this.label;
            if (i == 0) {
                C1795Pt1.b(obj);
                C3027bp1<a> c3027bp2 = this.$wakeMessage;
                C8079zf2 c8079zf2 = this.this$0.waiter;
                this.L$0 = c3027bp2;
                this.label = 1;
                Object objWaitForWake = c8079zf2.waitForWake(this);
                if (objWaitForWake == mn) {
                    return mn;
                }
                c3027bp1 = c3027bp2;
                t = objWaitForWake;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c3027bp1 = (C3027bp1) this.L$0;
                C1795Pt1.b(obj);
                t = obj;
            }
            c3027bp1.d = t;
            return Unit.a;
        }
    }

    public T91(@NotNull List<? extends InterfaceC3669eu0> executors, @NotNull S91 _operationModelStore, @NotNull C7582xI _configModelStore, @NotNull InterfaceC4092gv0 _time, @NotNull C7536x41 _newRecordState) {
        Intrinsics.checkNotNullParameter(executors, "executors");
        Intrinsics.checkNotNullParameter(_operationModelStore, "_operationModelStore");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_time, "_time");
        Intrinsics.checkNotNullParameter(_newRecordState, "_newRecordState");
        this._operationModelStore = _operationModelStore;
        this._configModelStore = _configModelStore;
        this._time = _time;
        this._newRecordState = _newRecordState;
        this.queue = new ArrayList();
        this.waiter = new C8079zf2<>();
        this.retryWaiter = new C8079zf2<>();
        this.coroutineScope = LN.a(Cm2.j("OpRepo"));
        this.initialized = C6561sS.e();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (InterfaceC3669eu0 interfaceC3669eu0 : executors) {
            Iterator<String> it = interfaceC3669eu0.getOperations().iterator();
            while (it.hasNext()) {
                linkedHashMap.put(it.next(), interfaceC3669eu0);
            }
        }
        this.executorsMap = linkedHashMap;
    }

    private final int getExecuteBucket() {
        int i2 = this.enqueueIntoBucket;
        if (i2 == 0) {
            return 0;
        }
        return i2 - 1;
    }

    private final List<b> getGroupableOperations(b startingOp) throws Exception {
        ArrayList arrayListH = WE.h(startingOp);
        if (startingOp.getOperation().getGroupComparisonType() != EnumC2583Zm0.NONE) {
            String createComparisonKey = startingOp.getOperation().getGroupComparisonType() == EnumC2583Zm0.CREATE ? startingOp.getOperation().getCreateComparisonKey() : startingOp.getOperation().getModifyComparisonKey();
            for (b bVar : CollectionsKt.e0(this.queue)) {
                String createComparisonKey2 = startingOp.getOperation().getGroupComparisonType() == EnumC2583Zm0.CREATE ? bVar.getOperation().getCreateComparisonKey() : bVar.getOperation().getModifyComparisonKey();
                if (Intrinsics.a(createComparisonKey2, "") && Intrinsics.a(createComparisonKey, "")) {
                    throw new Exception("Both comparison keys can not be blank!");
                }
                if (this._newRecordState.canAccess(bVar.getOperation().getApplyToRecordId()) && Intrinsics.a(createComparisonKey2, createComparisonKey)) {
                    this.queue.remove(bVar);
                    arrayListH.add(bVar);
                }
            }
        }
        return arrayListH;
    }

    private final void internalEnqueue(b queueItem, boolean flush, boolean addToStore, Integer index) {
        synchronized (this.queue) {
            try {
                List<b> list = this.queue;
                if (list == null || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.a(((b) it.next()).getOperation().getId(), queueItem.getOperation().getId())) {
                            NS0.debug$default("OperationRepo: internalEnqueue - operation.id: " + queueItem.getOperation().getId() + " already exists in the queue.", null, 2, null);
                            return;
                        }
                    }
                }
                if (index != null) {
                    this.queue.add(index.intValue(), queueItem);
                    Unit unit = Unit.a;
                } else {
                    this.queue.add(queueItem);
                }
                if (addToStore) {
                    InterfaceC7076ut0.a.add$default(this._operationModelStore, queueItem.getOperation(), null, 2, null);
                }
                this.waiter.wake(new a(flush, 0L));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void internalEnqueue$default(T91 t91, b bVar, boolean z, boolean z2, Integer num, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            num = null;
        }
        t91.internalEnqueue(bVar, z, z2, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x0069 A[PHI: r2
      0x0069: PHI (r2v4 T91) = (r2v2 T91), (r2v3 T91), (r2v5 T91), (r2v11 T91) binds: [B:24:0x0064, B:35:0x00b0, B:40:0x00be, B:17:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    /* JADX WARN: Code duplicated, block: B:31:0x0091  */
    /* JADX WARN: Code duplicated, block: B:34:0x009c A[PHI: r2
      0x009c: PHI (r2v3 T91) = (r2v4 T91), (r2v9 T91) binds: [B:32:0x0099, B:18:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b0 -> B:25:0x0069). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00bb -> B:40:0x00be). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object processQueueForever(defpackage.JM<? super kotlin.Unit> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof T91.h
            if (r0 == 0) goto L13
            r0 = r11
            T91$h r0 = (T91.h) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            T91$h r0 = new T91$h
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            MN r1 = defpackage.MN.d
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L55
            if (r2 == r6) goto L4d
            if (r2 == r5) goto L45
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r2 = r0.L$0
            T91 r2 = (defpackage.T91) r2
            defpackage.C1795Pt1.b(r11)
            goto Lbe
        L35:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3d:
            java.lang.Object r2 = r0.L$0
            T91 r2 = (defpackage.T91) r2
            defpackage.C1795Pt1.b(r11)
            goto L69
        L45:
            java.lang.Object r2 = r0.L$0
            T91 r2 = (defpackage.T91) r2
            defpackage.C1795Pt1.b(r11)
            goto L9c
        L4d:
            java.lang.Object r2 = r0.L$0
            T91 r2 = (defpackage.T91) r2
            defpackage.C1795Pt1.b(r11)
            goto L64
        L55:
            defpackage.C1795Pt1.b(r11)
            r0.L$0 = r10
            r0.label = r6
            java.lang.Object r11 = r10.waitForNewOperationAndExecutionInterval(r0)
            if (r11 != r1) goto L63
            goto Lbd
        L63:
            r2 = r10
        L64:
            int r11 = r2.enqueueIntoBucket
            int r11 = r11 + r6
            r2.enqueueIntoBucket = r11
        L69:
            boolean r11 = r2.paused
            r7 = 0
            if (r11 == 0) goto L76
            java.lang.String r11 = "OperationRepo is paused"
            defpackage.NS0.debug$default(r11, r7, r5, r7)
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        L76:
            int r11 = r2.getExecuteBucket()
            java.util.List r11 = r2.getNextOps$com_onesignal_core(r11)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "processQueueForever:ops:\n"
            r8.<init>(r9)
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            defpackage.NS0.debug$default(r8, r7, r5, r7)
            if (r11 == 0) goto Lb3
            r0.L$0 = r2
            r0.label = r5
            java.lang.Object r11 = r2.executeOperations$com_onesignal_core(r11, r0)
            if (r11 != r1) goto L9c
            goto Lbd
        L9c:
            xI r11 = r2._configModelStore
            D01 r11 = r11.getModel()
            wI r11 = (defpackage.C7371wI) r11
            long r7 = r11.getOpRepoPostWakeDelay()
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r11 = defpackage.IW.b(r7, r0)
            if (r11 != r1) goto L69
            goto Lbd
        Lb3:
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r11 = r2.waitForNewOperationAndExecutionInterval(r0)
            if (r11 != r1) goto Lbe
        Lbd:
            return r1
        Lbe:
            int r11 = r2.enqueueIntoBucket
            int r11 = r11 + r6
            r2.enqueueIntoBucket = r11
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.T91.processQueueForever(JM):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x0084  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0096, code lost:
    
        if (r11 == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0096 -> B:26:0x0099). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object waitForNewOperationAndExecutionInterval(defpackage.JM<? super kotlin.Unit> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof T91.j
            if (r0 == 0) goto L13
            r0 = r11
            T91$j r0 = (T91.j) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            T91$j r0 = new T91$j
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            MN r1 = defpackage.MN.d
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r2 = r0.L$1
            bp1 r2 = (defpackage.C3027bp1) r2
            java.lang.Object r4 = r0.L$0
            T91 r4 = (defpackage.T91) r4
            defpackage.C1795Pt1.b(r11)
            goto L99
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3a:
            java.lang.Object r2 = r0.L$2
            bp1 r2 = (defpackage.C3027bp1) r2
            java.lang.Object r4 = r0.L$1
            bp1 r4 = (defpackage.C3027bp1) r4
            java.lang.Object r5 = r0.L$0
            T91 r5 = (defpackage.T91) r5
            defpackage.C1795Pt1.b(r11)
            goto L61
        L4a:
            bp1 r2 = defpackage.C4564j.b(r11)
            zf2<T91$a> r11 = r10.waiter
            r0.L$0 = r10
            r0.L$1 = r2
            r0.L$2 = r2
            r0.label = r4
            java.lang.Object r11 = r11.waitForWake(r0)
            if (r11 != r1) goto L5f
            goto L98
        L5f:
            r5 = r10
            r4 = r2
        L61:
            r2.d = r11
            xI r11 = r5._configModelStore
            D01 r11 = r11.getModel()
            wI r11 = (defpackage.C7371wI) r11
            long r6 = r11.getOpRepoExecutionInterval()
            T r11 = r4.d
            T91$a r11 = (T91.a) r11
            long r8 = r11.getPreviousWaitedTime()
            long r6 = r6 - r8
            r2 = r4
            r4 = r5
        L7a:
            T r11 = r2.d
            T91$a r11 = (T91.a) r11
            boolean r11 = r11.getForce()
            if (r11 != 0) goto La9
            T91$k r11 = new T91$k
            r5 = 0
            r11.<init>(r2, r4, r5)
            r0.L$0 = r4
            r0.L$1 = r2
            r0.L$2 = r5
            r0.label = r3
            java.lang.Object r11 = defpackage.OZ1.c(r6, r11, r0)
            if (r11 != r1) goto L99
        L98:
            return r1
        L99:
            if (r11 != 0) goto L9c
            goto La9
        L9c:
            xI r11 = r4._configModelStore
            D01 r11 = r11.getModel()
            wI r11 = (defpackage.C7371wI) r11
            long r6 = r11.getOpRepoExecutionInterval()
            goto L7a
        La9:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.T91.waitForNewOperationAndExecutionInterval(JM):java.lang.Object");
    }

    @Override // defpackage.InterfaceC3879fu0
    @Nullable
    public Object awaitInitialized(@NotNull JM<? super Unit> jm) {
        Object objK0 = this.initialized.K0(jm);
        return objK0 == MN.d ? objK0 : Unit.a;
    }

    @Override // defpackage.InterfaceC3879fu0
    public <T extends Q91> boolean containsInstanceOf(@NotNull RI0<T> type) {
        boolean z;
        Intrinsics.checkNotNullParameter(type, "type");
        synchronized (this.queue) {
            try {
                List<b> list = this.queue;
                z = false;
                if (list == null || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (type.g(((b) it.next()).getOperation())) {
                            z = true;
                            break;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Nullable
    public final Object delayBeforeNextExecution(int i2, @Nullable Integer num, @NotNull JM<? super Unit> jm) {
        NS0.debug$default("retryAfterSeconds: " + num, null, 2, null);
        long jMax = Math.max(this._configModelStore.getModel().getOpRepoDefaultFailRetryBackoff() * ((long) i2), (num != null ? num.intValue() : 0L) * ((long) CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT));
        if (jMax < 1) {
            return Unit.a;
        }
        NS0.error$default("Operations being delay for: " + jMax + " ms", null, 2, null);
        Object objC = OZ1.c(jMax, new d(null), jm);
        return objC == MN.d ? objC : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object delayForPostCreate(long j2, @NotNull JM<? super Unit> jm) {
        e eVar;
        T91 t91;
        if (jm instanceof e) {
            eVar = (e) jm;
            int i2 = eVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.label = i2 - Integer.MIN_VALUE;
            } else {
                eVar = new e(jm);
            }
        } else {
            eVar = new e(jm);
        }
        Object obj = eVar.result;
        MN mn = MN.d;
        int i3 = eVar.label;
        if (i3 == 0) {
            C1795Pt1.b(obj);
            eVar.L$0 = this;
            eVar.J$0 = j2;
            eVar.label = 1;
            if (IW.b(j2, eVar) == mn) {
                return mn;
            }
            t91 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = eVar.J$0;
            t91 = (T91) eVar.L$0;
            C1795Pt1.b(obj);
        }
        synchronized (t91.queue) {
            if (!t91.queue.isEmpty()) {
                t91.waiter.wake(new a(false, j2));
            }
        }
        return Unit.a;
    }

    @Override // defpackage.InterfaceC3879fu0
    public void enqueue(@NotNull Q91 operation, boolean flush) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        NS0.log(EnumC5513nS0.DEBUG, "OperationRepo.enqueue(operation: " + operation + ", flush: " + flush + ')');
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        operation.setId(string);
        G71.INSTANCE.execute(new f(operation, flush, null));
    }

    @Override // defpackage.InterfaceC3879fu0
    @Nullable
    public Object enqueueAndWait(@NotNull Q91 q91, boolean z, @NotNull JM<? super Boolean> jm) {
        NS0.log(EnumC5513nS0.DEBUG, "OperationRepo.enqueueAndWait(operation: " + q91 + ", force: " + z + ')');
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        q91.setId(string);
        C8079zf2 c8079zf2 = new C8079zf2();
        internalEnqueue$default(this, new b(q91, c8079zf2, this.enqueueIntoBucket, 0, 8, null), z, true, null, 8, null);
        return c8079zf2.waitForWake(jm);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0206 A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:44:0x00da, B:46:0x00fa, B:47:0x00fe, B:49:0x0104, B:52:0x0119, B:53:0x011b, B:61:0x013e, B:62:0x013f, B:63:0x014d, B:65:0x0153, B:66:0x015f, B:67:0x0160, B:68:0x0161, B:69:0x0173, B:143:0x02f3, B:145:0x02f9, B:146:0x02fb, B:154:0x0352, B:156:0x0354, B:157:0x0355, B:158:0x0356, B:71:0x0178, B:72:0x0190, B:80:0x01af, B:82:0x01b2, B:83:0x01b3, B:84:0x01b4, B:85:0x01ca, B:96:0x0201, B:98:0x0204, B:99:0x0205, B:100:0x0206, B:102:0x0219, B:103:0x0220, B:104:0x0222, B:119:0x0262, B:121:0x0265, B:122:0x0266, B:123:0x0267, B:124:0x027f, B:126:0x0285, B:127:0x0299, B:128:0x029d, B:130:0x02a3, B:132:0x02af, B:133:0x02b7, B:134:0x02bb, B:136:0x02c1, B:137:0x02d5, B:138:0x02d9, B:140:0x02df, B:142:0x02eb, B:105:0x0223, B:106:0x022c, B:108:0x0232, B:110:0x023f, B:114:0x0246, B:115:0x024e, B:117:0x0254, B:118:0x0260, B:86:0x01cb, B:87:0x01d3, B:89:0x01d9, B:91:0x01ef, B:94:0x01f8, B:95:0x01ff, B:54:0x011c, B:55:0x0122, B:57:0x0128, B:60:0x013c, B:73:0x0191, B:74:0x0199, B:76:0x019f, B:79:0x01ad, B:147:0x02fc, B:148:0x0308, B:150:0x030e, B:153:0x0350), top: B:186:0x00da, inners: #1, #2, #4, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x0219 A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:44:0x00da, B:46:0x00fa, B:47:0x00fe, B:49:0x0104, B:52:0x0119, B:53:0x011b, B:61:0x013e, B:62:0x013f, B:63:0x014d, B:65:0x0153, B:66:0x015f, B:67:0x0160, B:68:0x0161, B:69:0x0173, B:143:0x02f3, B:145:0x02f9, B:146:0x02fb, B:154:0x0352, B:156:0x0354, B:157:0x0355, B:158:0x0356, B:71:0x0178, B:72:0x0190, B:80:0x01af, B:82:0x01b2, B:83:0x01b3, B:84:0x01b4, B:85:0x01ca, B:96:0x0201, B:98:0x0204, B:99:0x0205, B:100:0x0206, B:102:0x0219, B:103:0x0220, B:104:0x0222, B:119:0x0262, B:121:0x0265, B:122:0x0266, B:123:0x0267, B:124:0x027f, B:126:0x0285, B:127:0x0299, B:128:0x029d, B:130:0x02a3, B:132:0x02af, B:133:0x02b7, B:134:0x02bb, B:136:0x02c1, B:137:0x02d5, B:138:0x02d9, B:140:0x02df, B:142:0x02eb, B:105:0x0223, B:106:0x022c, B:108:0x0232, B:110:0x023f, B:114:0x0246, B:115:0x024e, B:117:0x0254, B:118:0x0260, B:86:0x01cb, B:87:0x01d3, B:89:0x01d9, B:91:0x01ef, B:94:0x01f8, B:95:0x01ff, B:54:0x011c, B:55:0x0122, B:57:0x0128, B:60:0x013c, B:73:0x0191, B:74:0x0199, B:76:0x019f, B:79:0x01ad, B:147:0x02fc, B:148:0x0308, B:150:0x030e, B:153:0x0350), top: B:186:0x00da, inners: #1, #2, #4, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0232 A[Catch: all -> 0x0244, TryCatch #1 {all -> 0x0244, blocks: (B:105:0x0223, B:106:0x022c, B:108:0x0232, B:110:0x023f, B:114:0x0246, B:115:0x024e, B:117:0x0254, B:118:0x0260), top: B:182:0x0223, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x023f A[Catch: all -> 0x0244, TryCatch #1 {all -> 0x0244, blocks: (B:105:0x0223, B:106:0x022c, B:108:0x0232, B:110:0x023f, B:114:0x0246, B:115:0x024e, B:117:0x0254, B:118:0x0260), top: B:182:0x0223, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0254 A[Catch: all -> 0x0244, LOOP:9: B:115:0x024e->B:117:0x0254, LOOP_END, TryCatch #1 {all -> 0x0244, blocks: (B:105:0x0223, B:106:0x022c, B:108:0x0232, B:110:0x023f, B:114:0x0246, B:115:0x024e, B:117:0x0254, B:118:0x0260), top: B:182:0x0223, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0267 A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:44:0x00da, B:46:0x00fa, B:47:0x00fe, B:49:0x0104, B:52:0x0119, B:53:0x011b, B:61:0x013e, B:62:0x013f, B:63:0x014d, B:65:0x0153, B:66:0x015f, B:67:0x0160, B:68:0x0161, B:69:0x0173, B:143:0x02f3, B:145:0x02f9, B:146:0x02fb, B:154:0x0352, B:156:0x0354, B:157:0x0355, B:158:0x0356, B:71:0x0178, B:72:0x0190, B:80:0x01af, B:82:0x01b2, B:83:0x01b3, B:84:0x01b4, B:85:0x01ca, B:96:0x0201, B:98:0x0204, B:99:0x0205, B:100:0x0206, B:102:0x0219, B:103:0x0220, B:104:0x0222, B:119:0x0262, B:121:0x0265, B:122:0x0266, B:123:0x0267, B:124:0x027f, B:126:0x0285, B:127:0x0299, B:128:0x029d, B:130:0x02a3, B:132:0x02af, B:133:0x02b7, B:134:0x02bb, B:136:0x02c1, B:137:0x02d5, B:138:0x02d9, B:140:0x02df, B:142:0x02eb, B:105:0x0223, B:106:0x022c, B:108:0x0232, B:110:0x023f, B:114:0x0246, B:115:0x024e, B:117:0x0254, B:118:0x0260, B:86:0x01cb, B:87:0x01d3, B:89:0x01d9, B:91:0x01ef, B:94:0x01f8, B:95:0x01ff, B:54:0x011c, B:55:0x0122, B:57:0x0128, B:60:0x013c, B:73:0x0191, B:74:0x0199, B:76:0x019f, B:79:0x01ad, B:147:0x02fc, B:148:0x0308, B:150:0x030e, B:153:0x0350), top: B:186:0x00da, inners: #1, #2, #4, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x0285 A[Catch: all -> 0x0116, LOOP:10: B:124:0x027f->B:126:0x0285, LOOP_END, TryCatch #3 {all -> 0x0116, blocks: (B:44:0x00da, B:46:0x00fa, B:47:0x00fe, B:49:0x0104, B:52:0x0119, B:53:0x011b, B:61:0x013e, B:62:0x013f, B:63:0x014d, B:65:0x0153, B:66:0x015f, B:67:0x0160, B:68:0x0161, B:69:0x0173, B:143:0x02f3, B:145:0x02f9, B:146:0x02fb, B:154:0x0352, B:156:0x0354, B:157:0x0355, B:158:0x0356, B:71:0x0178, B:72:0x0190, B:80:0x01af, B:82:0x01b2, B:83:0x01b3, B:84:0x01b4, B:85:0x01ca, B:96:0x0201, B:98:0x0204, B:99:0x0205, B:100:0x0206, B:102:0x0219, B:103:0x0220, B:104:0x0222, B:119:0x0262, B:121:0x0265, B:122:0x0266, B:123:0x0267, B:124:0x027f, B:126:0x0285, B:127:0x0299, B:128:0x029d, B:130:0x02a3, B:132:0x02af, B:133:0x02b7, B:134:0x02bb, B:136:0x02c1, B:137:0x02d5, B:138:0x02d9, B:140:0x02df, B:142:0x02eb, B:105:0x0223, B:106:0x022c, B:108:0x0232, B:110:0x023f, B:114:0x0246, B:115:0x024e, B:117:0x0254, B:118:0x0260, B:86:0x01cb, B:87:0x01d3, B:89:0x01d9, B:91:0x01ef, B:94:0x01f8, B:95:0x01ff, B:54:0x011c, B:55:0x0122, B:57:0x0128, B:60:0x013c, B:73:0x0191, B:74:0x0199, B:76:0x019f, B:79:0x01ad, B:147:0x02fc, B:148:0x0308, B:150:0x030e, B:153:0x0350), top: B:186:0x00da, inners: #1, #2, #4, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x02a3 A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:44:0x00da, B:46:0x00fa, B:47:0x00fe, B:49:0x0104, B:52:0x0119, B:53:0x011b, B:61:0x013e, B:62:0x013f, B:63:0x014d, B:65:0x0153, B:66:0x015f, B:67:0x0160, B:68:0x0161, B:69:0x0173, B:143:0x02f3, B:145:0x02f9, B:146:0x02fb, B:154:0x0352, B:156:0x0354, B:157:0x0355, B:158:0x0356, B:71:0x0178, B:72:0x0190, B:80:0x01af, B:82:0x01b2, B:83:0x01b3, B:84:0x01b4, B:85:0x01ca, B:96:0x0201, B:98:0x0204, B:99:0x0205, B:100:0x0206, B:102:0x0219, B:103:0x0220, B:104:0x0222, B:119:0x0262, B:121:0x0265, B:122:0x0266, B:123:0x0267, B:124:0x027f, B:126:0x0285, B:127:0x0299, B:128:0x029d, B:130:0x02a3, B:132:0x02af, B:133:0x02b7, B:134:0x02bb, B:136:0x02c1, B:137:0x02d5, B:138:0x02d9, B:140:0x02df, B:142:0x02eb, B:105:0x0223, B:106:0x022c, B:108:0x0232, B:110:0x023f, B:114:0x0246, B:115:0x024e, B:117:0x0254, B:118:0x0260, B:86:0x01cb, B:87:0x01d3, B:89:0x01d9, B:91:0x01ef, B:94:0x01f8, B:95:0x01ff, B:54:0x011c, B:55:0x0122, B:57:0x0128, B:60:0x013c, B:73:0x0191, B:74:0x0199, B:76:0x019f, B:79:0x01ad, B:147:0x02fc, B:148:0x0308, B:150:0x030e, B:153:0x0350), top: B:186:0x00da, inners: #1, #2, #4, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x02b7 A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:44:0x00da, B:46:0x00fa, B:47:0x00fe, B:49:0x0104, B:52:0x0119, B:53:0x011b, B:61:0x013e, B:62:0x013f, B:63:0x014d, B:65:0x0153, B:66:0x015f, B:67:0x0160, B:68:0x0161, B:69:0x0173, B:143:0x02f3, B:145:0x02f9, B:146:0x02fb, B:154:0x0352, B:156:0x0354, B:157:0x0355, B:158:0x0356, B:71:0x0178, B:72:0x0190, B:80:0x01af, B:82:0x01b2, B:83:0x01b3, B:84:0x01b4, B:85:0x01ca, B:96:0x0201, B:98:0x0204, B:99:0x0205, B:100:0x0206, B:102:0x0219, B:103:0x0220, B:104:0x0222, B:119:0x0262, B:121:0x0265, B:122:0x0266, B:123:0x0267, B:124:0x027f, B:126:0x0285, B:127:0x0299, B:128:0x029d, B:130:0x02a3, B:132:0x02af, B:133:0x02b7, B:134:0x02bb, B:136:0x02c1, B:137:0x02d5, B:138:0x02d9, B:140:0x02df, B:142:0x02eb, B:105:0x0223, B:106:0x022c, B:108:0x0232, B:110:0x023f, B:114:0x0246, B:115:0x024e, B:117:0x0254, B:118:0x0260, B:86:0x01cb, B:87:0x01d3, B:89:0x01d9, B:91:0x01ef, B:94:0x01f8, B:95:0x01ff, B:54:0x011c, B:55:0x0122, B:57:0x0128, B:60:0x013c, B:73:0x0191, B:74:0x0199, B:76:0x019f, B:79:0x01ad, B:147:0x02fc, B:148:0x0308, B:150:0x030e, B:153:0x0350), top: B:186:0x00da, inners: #1, #2, #4, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x02c1 A[Catch: all -> 0x0116, LOOP:12: B:134:0x02bb->B:136:0x02c1, LOOP_END, TryCatch #3 {all -> 0x0116, blocks: (B:44:0x00da, B:46:0x00fa, B:47:0x00fe, B:49:0x0104, B:52:0x0119, B:53:0x011b, B:61:0x013e, B:62:0x013f, B:63:0x014d, B:65:0x0153, B:66:0x015f, B:67:0x0160, B:68:0x0161, B:69:0x0173, B:143:0x02f3, B:145:0x02f9, B:146:0x02fb, B:154:0x0352, B:156:0x0354, B:157:0x0355, B:158:0x0356, B:71:0x0178, B:72:0x0190, B:80:0x01af, B:82:0x01b2, B:83:0x01b3, B:84:0x01b4, B:85:0x01ca, B:96:0x0201, B:98:0x0204, B:99:0x0205, B:100:0x0206, B:102:0x0219, B:103:0x0220, B:104:0x0222, B:119:0x0262, B:121:0x0265, B:122:0x0266, B:123:0x0267, B:124:0x027f, B:126:0x0285, B:127:0x0299, B:128:0x029d, B:130:0x02a3, B:132:0x02af, B:133:0x02b7, B:134:0x02bb, B:136:0x02c1, B:137:0x02d5, B:138:0x02d9, B:140:0x02df, B:142:0x02eb, B:105:0x0223, B:106:0x022c, B:108:0x0232, B:110:0x023f, B:114:0x0246, B:115:0x024e, B:117:0x0254, B:118:0x0260, B:86:0x01cb, B:87:0x01d3, B:89:0x01d9, B:91:0x01ef, B:94:0x01f8, B:95:0x01ff, B:54:0x011c, B:55:0x0122, B:57:0x0128, B:60:0x013c, B:73:0x0191, B:74:0x0199, B:76:0x019f, B:79:0x01ad, B:147:0x02fc, B:148:0x0308, B:150:0x030e, B:153:0x0350), top: B:186:0x00da, inners: #1, #2, #4, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x02df A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:44:0x00da, B:46:0x00fa, B:47:0x00fe, B:49:0x0104, B:52:0x0119, B:53:0x011b, B:61:0x013e, B:62:0x013f, B:63:0x014d, B:65:0x0153, B:66:0x015f, B:67:0x0160, B:68:0x0161, B:69:0x0173, B:143:0x02f3, B:145:0x02f9, B:146:0x02fb, B:154:0x0352, B:156:0x0354, B:157:0x0355, B:158:0x0356, B:71:0x0178, B:72:0x0190, B:80:0x01af, B:82:0x01b2, B:83:0x01b3, B:84:0x01b4, B:85:0x01ca, B:96:0x0201, B:98:0x0204, B:99:0x0205, B:100:0x0206, B:102:0x0219, B:103:0x0220, B:104:0x0222, B:119:0x0262, B:121:0x0265, B:122:0x0266, B:123:0x0267, B:124:0x027f, B:126:0x0285, B:127:0x0299, B:128:0x029d, B:130:0x02a3, B:132:0x02af, B:133:0x02b7, B:134:0x02bb, B:136:0x02c1, B:137:0x02d5, B:138:0x02d9, B:140:0x02df, B:142:0x02eb, B:105:0x0223, B:106:0x022c, B:108:0x0232, B:110:0x023f, B:114:0x0246, B:115:0x024e, B:117:0x0254, B:118:0x0260, B:86:0x01cb, B:87:0x01d3, B:89:0x01d9, B:91:0x01ef, B:94:0x01f8, B:95:0x01ff, B:54:0x011c, B:55:0x0122, B:57:0x0128, B:60:0x013c, B:73:0x0191, B:74:0x0199, B:76:0x019f, B:79:0x01ad, B:147:0x02fc, B:148:0x0308, B:150:0x030e, B:153:0x0350), top: B:186:0x00da, inners: #1, #2, #4, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x02f9 A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:44:0x00da, B:46:0x00fa, B:47:0x00fe, B:49:0x0104, B:52:0x0119, B:53:0x011b, B:61:0x013e, B:62:0x013f, B:63:0x014d, B:65:0x0153, B:66:0x015f, B:67:0x0160, B:68:0x0161, B:69:0x0173, B:143:0x02f3, B:145:0x02f9, B:146:0x02fb, B:154:0x0352, B:156:0x0354, B:157:0x0355, B:158:0x0356, B:71:0x0178, B:72:0x0190, B:80:0x01af, B:82:0x01b2, B:83:0x01b3, B:84:0x01b4, B:85:0x01ca, B:96:0x0201, B:98:0x0204, B:99:0x0205, B:100:0x0206, B:102:0x0219, B:103:0x0220, B:104:0x0222, B:119:0x0262, B:121:0x0265, B:122:0x0266, B:123:0x0267, B:124:0x027f, B:126:0x0285, B:127:0x0299, B:128:0x029d, B:130:0x02a3, B:132:0x02af, B:133:0x02b7, B:134:0x02bb, B:136:0x02c1, B:137:0x02d5, B:138:0x02d9, B:140:0x02df, B:142:0x02eb, B:105:0x0223, B:106:0x022c, B:108:0x0232, B:110:0x023f, B:114:0x0246, B:115:0x024e, B:117:0x0254, B:118:0x0260, B:86:0x01cb, B:87:0x01d3, B:89:0x01d9, B:91:0x01ef, B:94:0x01f8, B:95:0x01ff, B:54:0x011c, B:55:0x0122, B:57:0x0128, B:60:0x013c, B:73:0x0191, B:74:0x0199, B:76:0x019f, B:79:0x01ad, B:147:0x02fc, B:148:0x0308, B:150:0x030e, B:153:0x0350), top: B:186:0x00da, inners: #1, #2, #4, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x030e A[Catch: all -> 0x034e, LOOP:5: B:148:0x0308->B:150:0x030e, LOOP_END, TryCatch #7 {all -> 0x034e, blocks: (B:147:0x02fc, B:148:0x0308, B:150:0x030e, B:153:0x0350), top: B:193:0x02fc, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x036d  */
    /* JADX WARN: Code duplicated, block: B:164:0x0374 A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #9 {all -> 0x003f, blocks: (B:14:0x003a, B:162:0x036e, B:164:0x0374), top: B:198:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:172:0x03c7 A[LOOP:0: B:170:0x03c1->B:172:0x03c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:176:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:182:0x0223 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x01cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x011c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0191 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x02fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x03f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x03df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x01f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0242 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x02af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x029d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x02eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x02d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00fa A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:44:0x00da, B:46:0x00fa, B:47:0x00fe, B:49:0x0104, B:52:0x0119, B:53:0x011b, B:61:0x013e, B:62:0x013f, B:63:0x014d, B:65:0x0153, B:66:0x015f, B:67:0x0160, B:68:0x0161, B:69:0x0173, B:143:0x02f3, B:145:0x02f9, B:146:0x02fb, B:154:0x0352, B:156:0x0354, B:157:0x0355, B:158:0x0356, B:71:0x0178, B:72:0x0190, B:80:0x01af, B:82:0x01b2, B:83:0x01b3, B:84:0x01b4, B:85:0x01ca, B:96:0x0201, B:98:0x0204, B:99:0x0205, B:100:0x0206, B:102:0x0219, B:103:0x0220, B:104:0x0222, B:119:0x0262, B:121:0x0265, B:122:0x0266, B:123:0x0267, B:124:0x027f, B:126:0x0285, B:127:0x0299, B:128:0x029d, B:130:0x02a3, B:132:0x02af, B:133:0x02b7, B:134:0x02bb, B:136:0x02c1, B:137:0x02d5, B:138:0x02d9, B:140:0x02df, B:142:0x02eb, B:105:0x0223, B:106:0x022c, B:108:0x0232, B:110:0x023f, B:114:0x0246, B:115:0x024e, B:117:0x0254, B:118:0x0260, B:86:0x01cb, B:87:0x01d3, B:89:0x01d9, B:91:0x01ef, B:94:0x01f8, B:95:0x01ff, B:54:0x011c, B:55:0x0122, B:57:0x0128, B:60:0x013c, B:73:0x0191, B:74:0x0199, B:76:0x019f, B:79:0x01ad, B:147:0x02fc, B:148:0x0308, B:150:0x030e, B:153:0x0350), top: B:186:0x00da, inners: #1, #2, #4, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0104 A[Catch: all -> 0x0116, LOOP:2: B:47:0x00fe->B:49:0x0104, LOOP_END, TryCatch #3 {all -> 0x0116, blocks: (B:44:0x00da, B:46:0x00fa, B:47:0x00fe, B:49:0x0104, B:52:0x0119, B:53:0x011b, B:61:0x013e, B:62:0x013f, B:63:0x014d, B:65:0x0153, B:66:0x015f, B:67:0x0160, B:68:0x0161, B:69:0x0173, B:143:0x02f3, B:145:0x02f9, B:146:0x02fb, B:154:0x0352, B:156:0x0354, B:157:0x0355, B:158:0x0356, B:71:0x0178, B:72:0x0190, B:80:0x01af, B:82:0x01b2, B:83:0x01b3, B:84:0x01b4, B:85:0x01ca, B:96:0x0201, B:98:0x0204, B:99:0x0205, B:100:0x0206, B:102:0x0219, B:103:0x0220, B:104:0x0222, B:119:0x0262, B:121:0x0265, B:122:0x0266, B:123:0x0267, B:124:0x027f, B:126:0x0285, B:127:0x0299, B:128:0x029d, B:130:0x02a3, B:132:0x02af, B:133:0x02b7, B:134:0x02bb, B:136:0x02c1, B:137:0x02d5, B:138:0x02d9, B:140:0x02df, B:142:0x02eb, B:105:0x0223, B:106:0x022c, B:108:0x0232, B:110:0x023f, B:114:0x0246, B:115:0x024e, B:117:0x0254, B:118:0x0260, B:86:0x01cb, B:87:0x01d3, B:89:0x01d9, B:91:0x01ef, B:94:0x01f8, B:95:0x01ff, B:54:0x011c, B:55:0x0122, B:57:0x0128, B:60:0x013c, B:73:0x0191, B:74:0x0199, B:76:0x019f, B:79:0x01ad, B:147:0x02fc, B:148:0x0308, B:150:0x030e, B:153:0x0350), top: B:186:0x00da, inners: #1, #2, #4, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0128 A[Catch: all -> 0x013a, LOOP:3: B:55:0x0122->B:57:0x0128, LOOP_END, TryCatch #4 {all -> 0x013a, blocks: (B:54:0x011c, B:55:0x0122, B:57:0x0128, B:60:0x013c), top: B:187:0x011c, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0153 A[Catch: all -> 0x0116, LOOP:4: B:63:0x014d->B:65:0x0153, LOOP_END, TryCatch #3 {all -> 0x0116, blocks: (B:44:0x00da, B:46:0x00fa, B:47:0x00fe, B:49:0x0104, B:52:0x0119, B:53:0x011b, B:61:0x013e, B:62:0x013f, B:63:0x014d, B:65:0x0153, B:66:0x015f, B:67:0x0160, B:68:0x0161, B:69:0x0173, B:143:0x02f3, B:145:0x02f9, B:146:0x02fb, B:154:0x0352, B:156:0x0354, B:157:0x0355, B:158:0x0356, B:71:0x0178, B:72:0x0190, B:80:0x01af, B:82:0x01b2, B:83:0x01b3, B:84:0x01b4, B:85:0x01ca, B:96:0x0201, B:98:0x0204, B:99:0x0205, B:100:0x0206, B:102:0x0219, B:103:0x0220, B:104:0x0222, B:119:0x0262, B:121:0x0265, B:122:0x0266, B:123:0x0267, B:124:0x027f, B:126:0x0285, B:127:0x0299, B:128:0x029d, B:130:0x02a3, B:132:0x02af, B:133:0x02b7, B:134:0x02bb, B:136:0x02c1, B:137:0x02d5, B:138:0x02d9, B:140:0x02df, B:142:0x02eb, B:105:0x0223, B:106:0x022c, B:108:0x0232, B:110:0x023f, B:114:0x0246, B:115:0x024e, B:117:0x0254, B:118:0x0260, B:86:0x01cb, B:87:0x01d3, B:89:0x01d9, B:91:0x01ef, B:94:0x01f8, B:95:0x01ff, B:54:0x011c, B:55:0x0122, B:57:0x0128, B:60:0x013c, B:73:0x0191, B:74:0x0199, B:76:0x019f, B:79:0x01ad, B:147:0x02fc, B:148:0x0308, B:150:0x030e, B:153:0x0350), top: B:186:0x00da, inners: #1, #2, #4, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0176  */
    /* JADX WARN: Code duplicated, block: B:71:0x0178 A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:44:0x00da, B:46:0x00fa, B:47:0x00fe, B:49:0x0104, B:52:0x0119, B:53:0x011b, B:61:0x013e, B:62:0x013f, B:63:0x014d, B:65:0x0153, B:66:0x015f, B:67:0x0160, B:68:0x0161, B:69:0x0173, B:143:0x02f3, B:145:0x02f9, B:146:0x02fb, B:154:0x0352, B:156:0x0354, B:157:0x0355, B:158:0x0356, B:71:0x0178, B:72:0x0190, B:80:0x01af, B:82:0x01b2, B:83:0x01b3, B:84:0x01b4, B:85:0x01ca, B:96:0x0201, B:98:0x0204, B:99:0x0205, B:100:0x0206, B:102:0x0219, B:103:0x0220, B:104:0x0222, B:119:0x0262, B:121:0x0265, B:122:0x0266, B:123:0x0267, B:124:0x027f, B:126:0x0285, B:127:0x0299, B:128:0x029d, B:130:0x02a3, B:132:0x02af, B:133:0x02b7, B:134:0x02bb, B:136:0x02c1, B:137:0x02d5, B:138:0x02d9, B:140:0x02df, B:142:0x02eb, B:105:0x0223, B:106:0x022c, B:108:0x0232, B:110:0x023f, B:114:0x0246, B:115:0x024e, B:117:0x0254, B:118:0x0260, B:86:0x01cb, B:87:0x01d3, B:89:0x01d9, B:91:0x01ef, B:94:0x01f8, B:95:0x01ff, B:54:0x011c, B:55:0x0122, B:57:0x0128, B:60:0x013c, B:73:0x0191, B:74:0x0199, B:76:0x019f, B:79:0x01ad, B:147:0x02fc, B:148:0x0308, B:150:0x030e, B:153:0x0350), top: B:186:0x00da, inners: #1, #2, #4, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x019f A[Catch: all -> 0x01ab, LOOP:6: B:74:0x0199->B:76:0x019f, LOOP_END, TryCatch #5 {all -> 0x01ab, blocks: (B:73:0x0191, B:74:0x0199, B:76:0x019f, B:79:0x01ad), top: B:189:0x0191, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b4 A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:44:0x00da, B:46:0x00fa, B:47:0x00fe, B:49:0x0104, B:52:0x0119, B:53:0x011b, B:61:0x013e, B:62:0x013f, B:63:0x014d, B:65:0x0153, B:66:0x015f, B:67:0x0160, B:68:0x0161, B:69:0x0173, B:143:0x02f3, B:145:0x02f9, B:146:0x02fb, B:154:0x0352, B:156:0x0354, B:157:0x0355, B:158:0x0356, B:71:0x0178, B:72:0x0190, B:80:0x01af, B:82:0x01b2, B:83:0x01b3, B:84:0x01b4, B:85:0x01ca, B:96:0x0201, B:98:0x0204, B:99:0x0205, B:100:0x0206, B:102:0x0219, B:103:0x0220, B:104:0x0222, B:119:0x0262, B:121:0x0265, B:122:0x0266, B:123:0x0267, B:124:0x027f, B:126:0x0285, B:127:0x0299, B:128:0x029d, B:130:0x02a3, B:132:0x02af, B:133:0x02b7, B:134:0x02bb, B:136:0x02c1, B:137:0x02d5, B:138:0x02d9, B:140:0x02df, B:142:0x02eb, B:105:0x0223, B:106:0x022c, B:108:0x0232, B:110:0x023f, B:114:0x0246, B:115:0x024e, B:117:0x0254, B:118:0x0260, B:86:0x01cb, B:87:0x01d3, B:89:0x01d9, B:91:0x01ef, B:94:0x01f8, B:95:0x01ff, B:54:0x011c, B:55:0x0122, B:57:0x0128, B:60:0x013c, B:73:0x0191, B:74:0x0199, B:76:0x019f, B:79:0x01ad, B:147:0x02fc, B:148:0x0308, B:150:0x030e, B:153:0x0350), top: B:186:0x00da, inners: #1, #2, #4, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01d9 A[Catch: all -> 0x01f6, TryCatch #2 {all -> 0x01f6, blocks: (B:86:0x01cb, B:87:0x01d3, B:89:0x01d9, B:91:0x01ef, B:94:0x01f8, B:95:0x01ff), top: B:184:0x01cb, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01ef A[Catch: all -> 0x01f6, TryCatch #2 {all -> 0x01f6, blocks: (B:86:0x01cb, B:87:0x01d3, B:89:0x01d9, B:91:0x01ef, B:94:0x01f8, B:95:0x01ff), top: B:184:0x01cb, outer: #3 }] */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x038d, code lost:
    
        if (r0 == r5) goto L166;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:123:0x0267, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:71:0x0178, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:84:0x01b4, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [T91] */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object executeOperations$com_onesignal_core(@org.jetbrains.annotations.NotNull java.util.List<T91.b> r24, @org.jetbrains.annotations.NotNull defpackage.JM<? super kotlin.Unit> r25) {
        /*
            Method dump skipped, instruction units count: 1038
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.T91.executeOperations$com_onesignal_core(java.util.List, JM):java.lang.Object");
    }

    @Override // defpackage.InterfaceC3879fu0
    public void forceExecuteOperations() {
        int i2 = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        long j2 = 0;
        this.retryWaiter.wake(new a(true, j2, i2, defaultConstructorMarker));
        this.waiter.wake(new a(false, j2, i2, defaultConstructorMarker));
    }

    @Nullable
    public final List<b> getNextOps$com_onesignal_core(int bucketFilter) {
        List<b> groupableOperations;
        Object next;
        synchronized (this.queue) {
            try {
                Iterator<T> it = this.queue.iterator();
                while (true) {
                    groupableOperations = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    b bVar = (b) next;
                    if (bVar.getOperation().getCanStartExecute() && this._newRecordState.canAccess(bVar.getOperation().getApplyToRecordId()) && bVar.getBucket() <= bucketFilter) {
                        break;
                    }
                }
                b bVar2 = (b) next;
                if (bVar2 != null) {
                    this.queue.remove(bVar2);
                    groupableOperations = getGroupableOperations(bVar2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return groupableOperations;
    }

    @NotNull
    public final List<b> getQueue$com_onesignal_core() {
        return this.queue;
    }

    public final void loadSavedOperations$com_onesignal_core() {
        this._operationModelStore.loadOperations();
        Iterator it = CollectionsKt.S(this._operationModelStore.list()).iterator();
        while (it.hasNext()) {
            internalEnqueue(new b((Q91) it.next(), null, this.enqueueIntoBucket, 0, 10, null), false, false, 0);
        }
        this.initialized.L0(Unit.a);
    }

    @Override // defpackage.InterfaceC2529Yu0
    public void start() {
        this.paused = false;
        C5189lv.k(this.coroutineScope, null, new i(null), 3);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LT91$a;", "", "", "force", "", "previousWaitedTime", "<init>", "(ZJ)V", "Z", "getForce", "()Z", "J", "getPreviousWaitedTime", "()J", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        private final boolean force;
        private final long previousWaitedTime;

        public a(boolean z, long j) {
            this.force = z;
            this.previousWaitedTime = j;
        }

        public final boolean getForce() {
            return this.force;
        }

        public final long getPreviousWaitedTime() {
            return this.previousWaitedTime;
        }

        public /* synthetic */ a(boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? 0L : j);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LT91$b;", "", "LQ91;", "operation", "Lzf2;", "", "waiter", "", "bucket", "retries", "<init>", "(LQ91;Lzf2;II)V", "", "toString", "()Ljava/lang/String;", "LQ91;", "getOperation", "()LQ91;", "Lzf2;", "getWaiter", "()Lzf2;", "I", "getBucket", "()I", "getRetries", "setRetries", "(I)V", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class b {
        private final int bucket;

        @NotNull
        private final Q91 operation;
        private int retries;

        @Nullable
        private final C8079zf2<Boolean> waiter;

        public b(@NotNull Q91 operation, @Nullable C8079zf2<Boolean> c8079zf2, int i, int i2) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.operation = operation;
            this.waiter = c8079zf2;
            this.bucket = i;
            this.retries = i2;
        }

        public final int getBucket() {
            return this.bucket;
        }

        @NotNull
        public final Q91 getOperation() {
            return this.operation;
        }

        public final int getRetries() {
            return this.retries;
        }

        @Nullable
        public final C8079zf2<Boolean> getWaiter() {
            return this.waiter;
        }

        public final void setRetries(int i) {
            this.retries = i;
        }

        @NotNull
        public String toString() {
            return "bucket:" + this.bucket + ", retries:" + this.retries + ", operation:" + this.operation + '\n';
        }

        public /* synthetic */ b(Q91 q91, C8079zf2 c8079zf2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(q91, (i3 & 2) != 0 ? null : c8079zf2, i, (i3 & 8) != 0 ? 0 : i2);
        }
    }
}
