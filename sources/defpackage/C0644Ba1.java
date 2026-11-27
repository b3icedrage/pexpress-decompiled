package defpackage;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ba1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010#\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BW\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u001aH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J+\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010\"\u001a\u00020!2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#H\u0082@ø\u0001\u0000¢\u0006\u0004\b'\u0010(J;\u0010.\u001a\u0004\u0018\u00010&2\u0006\u0010\"\u001a\u00020!2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020$0#H\u0082@ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u001f\u00103\u001a\u0002012\u0006\u00100\u001a\u00020$2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J#\u00105\u001a\b\u0012\u0004\u0012\u00020$0#2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u001a2\u0006\u00107\u001a\u00020\u001dH\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u001a2\u0006\u00107\u001a\u00020\u001dH\u0002¢\u0006\u0004\b:\u00109J\u000f\u0010;\u001a\u00020\u001aH\u0002¢\u0006\u0004\b;\u0010<J1\u0010=\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#2\u0006\u0010\"\u001a\u00020!2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020$0#H\u0082@ø\u0001\u0000¢\u0006\u0004\b=\u0010(J\u001b\u0010>\u001a\u00020\u001a2\u0006\u00107\u001a\u00020\u001dH\u0082@ø\u0001\u0000¢\u0006\u0004\b>\u0010 J\u000f\u0010?\u001a\u00020\u001aH\u0016¢\u0006\u0004\b?\u0010<J\u000f\u0010@\u001a\u00020\u001aH\u0016¢\u0006\u0004\b@\u0010<J\u000f\u0010A\u001a\u00020\u001aH\u0016¢\u0006\u0004\bA\u0010<J\u0017\u0010C\u001a\u00020\u001a2\u0006\u0010B\u001a\u00020+H\u0016¢\u0006\u0004\bC\u0010DJ\u001d\u0010E\u001a\u0004\u0018\u00010&2\u0006\u0010B\u001a\u00020+H\u0096@ø\u0001\u0000¢\u0006\u0004\bE\u0010FJ\u001d\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010\"\u001a\u00020!H\u0096@ø\u0001\u0000¢\u0006\u0004\b'\u0010GJ\u001d\u0010H\u001a\u0004\u0018\u00010&2\u0006\u0010\"\u001a\u00020!H\u0096@ø\u0001\u0000¢\u0006\u0004\bH\u0010GJ%\u0010I\u001a\u0004\u0018\u00010&2\u0006\u0010\"\u001a\u00020!2\u0006\u0010*\u001a\u00020)H\u0096@ø\u0001\u0000¢\u0006\u0004\bI\u0010JR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010KR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010LR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010MR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010NR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010OR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010PR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010QR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010RR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010SR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010TR\u001c\u0010V\u001a\b\u0012\u0004\u0012\u00020!0U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010W\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006X"}, d2 = {"LBa1;", "Lju0;", "LYu0;", "LPu0;", "LRu0;", "_session", "Lct0;", "_influenceManager", "Llu0;", "_outcomeEventsCache", "Lku0;", "_outcomeEventsPreferences", "Liu0;", "_outcomeEventsBackend", "LxI;", "_configModelStore", "LTv0;", "_identityModelStore", "Lcv0;", "_subscriptionManager", "Lws0;", "_deviceService", "Lgv0;", "_time", "<init>", "(LRu0;Lct0;Llu0;Lku0;Liu0;LxI;LTv0;Lcv0;Lws0;Lgv0;)V", "", "sendSavedOutcomes", "(LJM;)Ljava/lang/Object;", "Lza1;", "event", "sendSavedOutcomeEvent", "(Lza1;LJM;)Ljava/lang/Object;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "LJz0;", "sessionInfluences", "Lya1;", "sendUniqueOutcomeEvent", "(Ljava/lang/String;Ljava/util/List;LJM;)Ljava/lang/Object;", "", "weight", "", "sessionTime", "influences", "sendAndCreateOutcomeEvent", "(Ljava/lang/String;FJLjava/util/List;LJM;)Ljava/lang/Object;", "influence", "LFa1;", "sourceBody", "setSourceChannelIds", "(LJz0;LFa1;)LFa1;", "removeDisabledInfluences", "(Ljava/util/List;)Ljava/util/List;", "eventParams", "saveUniqueOutcome", "(Lza1;)V", "saveAttributedUniqueOutcomeNotifications", "saveUnattributedUniqueOutcomeEvents", "()V", "getUniqueIds", "requestMeasureOutcomeEvent", "start", "onSessionStarted", "onSessionActive", "duration", "onSessionEnded", "(J)V", "sendSessionEndOutcomeEvent", "(JLJM;)Ljava/lang/Object;", "(Ljava/lang/String;LJM;)Ljava/lang/Object;", "sendOutcomeEvent", "sendOutcomeEventWithValue", "(Ljava/lang/String;FLJM;)Ljava/lang/Object;", "LRu0;", "Lct0;", "Llu0;", "Lku0;", "Liu0;", "LxI;", "LTv0;", "Lcv0;", "Lws0;", "Lgv0;", "", "unattributedUniqueOutcomeEventsSentOnSession", "Ljava/util/Set;", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C0644Ba1 implements InterfaceC4767ju0, InterfaceC2529Yu0, InterfaceC1797Pu0 {

    @NotNull
    private final C7582xI _configModelStore;

    @NotNull
    private final InterfaceC7494ws0 _deviceService;

    @NotNull
    private final C2112Tv0 _identityModelStore;

    @NotNull
    private final InterfaceC3247ct0 _influenceManager;

    @NotNull
    private final InterfaceC4547iu0 _outcomeEventsBackend;

    @NotNull
    private final InterfaceC5187lu0 _outcomeEventsCache;

    @NotNull
    private final InterfaceC4977ku0 _outcomeEventsPreferences;

    @NotNull
    private final InterfaceC1953Ru0 _session;

    @NotNull
    private final InterfaceC3253cv0 _subscriptionManager;

    @NotNull
    private final InterfaceC4092gv0 _time;

    @NotNull
    private Set<String> unattributedUniqueOutcomeEventsSentOnSession;

    /* JADX INFO: renamed from: Ba1$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[EnumC1890Qz0.values().length];
            iArr[EnumC1890Qz0.DIRECT.ordinal()] = 1;
            iArr[EnumC1890Qz0.INDIRECT.ordinal()] = 2;
            iArr[EnumC1890Qz0.UNATTRIBUTED.ordinal()] = 3;
            iArr[EnumC1890Qz0.DISABLED.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EnumC1420Kz0.values().length];
            iArr2[EnumC1420Kz0.IAM.ordinal()] = 1;
            iArr2[EnumC1420Kz0.NOTIFICATION.ordinal()] = 2;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: Ba1$b */
    @InterfaceC3368dU(c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsController", f = "OutcomeEventsController.kt", l = {295}, m = "getUniqueIds")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b extends LM {
        int label;
        /* synthetic */ Object result;

        public b(JM<? super b> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C0644Ba1.this.getUniqueIds(null, null, this);
        }
    }

    /* JADX INFO: renamed from: Ba1$c */
    @InterfaceC3368dU(c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsController$saveAttributedUniqueOutcomeNotifications$1", f = "OutcomeEventsController.kt", l = {276}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class c extends AW1 implements Function1<JM<? super Unit>, Object> {
        final /* synthetic */ C8058za1 $eventParams;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C8058za1 c8058za1, JM<? super c> jm) {
            super(1, jm);
            this.$eventParams = c8058za1;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return C0644Ba1.this.new c(this.$eventParams, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable JM<? super Unit> jm) {
            return ((c) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.label;
            if (i == 0) {
                C1795Pt1.b(obj);
                InterfaceC5187lu0 interfaceC5187lu0 = C0644Ba1.this._outcomeEventsCache;
                C8058za1 c8058za1 = this.$eventParams;
                this.label = 1;
                if (interfaceC5187lu0.saveUniqueOutcomeEventParams(c8058za1, this) == mn) {
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

    /* JADX INFO: renamed from: Ba1$d */
    @InterfaceC3368dU(c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsController", f = "OutcomeEventsController.kt", l = {216, 230}, m = "sendAndCreateOutcomeEvent")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class d extends LM {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public d(JM<? super d> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C0644Ba1.this.sendAndCreateOutcomeEvent(null, 0.0f, 0L, null, this);
        }
    }

    /* JADX INFO: renamed from: Ba1$e */
    @InterfaceC3368dU(c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsController", f = "OutcomeEventsController.kt", l = {74, 76}, m = "sendSavedOutcomeEvent")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class e extends LM {
        Object L$0;
        Object L$1;
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
            return C0644Ba1.this.sendSavedOutcomeEvent(null, this);
        }
    }

    /* JADX INFO: renamed from: Ba1$f */
    @InterfaceC3368dU(c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsController", f = "OutcomeEventsController.kt", l = {66, 68}, m = "sendSavedOutcomes")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class f extends LM {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public f(JM<? super f> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C0644Ba1.this.sendSavedOutcomes(this);
        }
    }

    /* JADX INFO: renamed from: Ba1$g */
    @InterfaceC3368dU(c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsController", f = "OutcomeEventsController.kt", l = {140, 153, 169}, m = "sendUniqueOutcomeEvent")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class g extends LM {
        Object L$0;
        Object L$1;
        Object L$2;
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
            return C0644Ba1.this.sendUniqueOutcomeEvent(null, null, this);
        }
    }

    /* JADX INFO: renamed from: Ba1$h */
    @InterfaceC3368dU(c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsController$start$1", f = "OutcomeEventsController.kt", l = {45, 46}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class h extends AW1 implements Function1<JM<? super Unit>, Object> {
        int label;

        public h(JM<? super h> jm) {
            super(1, jm);
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return C0644Ba1.this.new h(jm);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable JM<? super Unit> jm) {
            return ((h) create(jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
        
            if (r5.cleanCachedUniqueOutcomeEventNotifications(r4) == r0) goto L15;
         */
        @Override // defpackage.AbstractC7487wq
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
            /*
                r4 = this;
                MN r0 = defpackage.MN.d
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                defpackage.C1795Pt1.b(r5)
                goto L39
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                defpackage.C1795Pt1.b(r5)
                goto L2a
            L1c:
                defpackage.C1795Pt1.b(r5)
                Ba1 r5 = defpackage.C0644Ba1.this
                r4.label = r3
                java.lang.Object r5 = defpackage.C0644Ba1.access$sendSavedOutcomes(r5, r4)
                if (r5 != r0) goto L2a
                goto L38
            L2a:
                Ba1 r5 = defpackage.C0644Ba1.this
                lu0 r5 = defpackage.C0644Ba1.access$get_outcomeEventsCache$p(r5)
                r4.label = r2
                java.lang.Object r5 = r5.cleanCachedUniqueOutcomeEventNotifications(r4)
                if (r5 != r0) goto L39
            L38:
                return r0
            L39:
                kotlin.Unit r5 = kotlin.Unit.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C0644Ba1.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C0644Ba1(@NotNull InterfaceC1953Ru0 _session, @NotNull InterfaceC3247ct0 _influenceManager, @NotNull InterfaceC5187lu0 _outcomeEventsCache, @NotNull InterfaceC4977ku0 _outcomeEventsPreferences, @NotNull InterfaceC4547iu0 _outcomeEventsBackend, @NotNull C7582xI _configModelStore, @NotNull C2112Tv0 _identityModelStore, @NotNull InterfaceC3253cv0 _subscriptionManager, @NotNull InterfaceC7494ws0 _deviceService, @NotNull InterfaceC4092gv0 _time) {
        Intrinsics.checkNotNullParameter(_session, "_session");
        Intrinsics.checkNotNullParameter(_influenceManager, "_influenceManager");
        Intrinsics.checkNotNullParameter(_outcomeEventsCache, "_outcomeEventsCache");
        Intrinsics.checkNotNullParameter(_outcomeEventsPreferences, "_outcomeEventsPreferences");
        Intrinsics.checkNotNullParameter(_outcomeEventsBackend, "_outcomeEventsBackend");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_subscriptionManager, "_subscriptionManager");
        Intrinsics.checkNotNullParameter(_deviceService, "_deviceService");
        Intrinsics.checkNotNullParameter(_time, "_time");
        this._session = _session;
        this._influenceManager = _influenceManager;
        this._outcomeEventsCache = _outcomeEventsCache;
        this._outcomeEventsPreferences = _outcomeEventsPreferences;
        this._outcomeEventsBackend = _outcomeEventsBackend;
        this._configModelStore = _configModelStore;
        this._identityModelStore = _identityModelStore;
        this._subscriptionManager = _subscriptionManager;
        this._deviceService = _deviceService;
        this._time = _time;
        this.unattributedUniqueOutcomeEventsSentOnSession = new LinkedHashSet();
        Set<String> unattributedUniqueOutcomeEventsSentByChannel = _outcomeEventsPreferences.getUnattributedUniqueOutcomeEventsSentByChannel();
        this.unattributedUniqueOutcomeEventsSentOnSession = unattributedUniqueOutcomeEventsSentByChannel != null ? CollectionsKt.g0(unattributedUniqueOutcomeEventsSentByChannel) : new LinkedHashSet();
        _session.subscribe(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getUniqueIds(String str, List<C1342Jz0> list, JM<? super List<C1342Jz0>> jm) {
        b bVar;
        if (jm instanceof b) {
            bVar = (b) jm;
            int i = bVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.label = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(jm);
            }
        } else {
            bVar = new b(jm);
        }
        Object notCachedUniqueInfluencesForOutcome = bVar.result;
        MN mn = MN.d;
        int i2 = bVar.label;
        if (i2 == 0) {
            C1795Pt1.b(notCachedUniqueInfluencesForOutcome);
            InterfaceC5187lu0 interfaceC5187lu0 = this._outcomeEventsCache;
            bVar.label = 1;
            notCachedUniqueInfluencesForOutcome = interfaceC5187lu0.getNotCachedUniqueInfluencesForOutcome(str, list, bVar);
            if (notCachedUniqueInfluencesForOutcome == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(notCachedUniqueInfluencesForOutcome);
        }
        List list2 = (List) notCachedUniqueInfluencesForOutcome;
        if (list2.isEmpty()) {
            return null;
        }
        return list2;
    }

    private final List<C1342Jz0> removeDisabledInfluences(List<C1342Jz0> influences) {
        ArrayList arrayListF0 = CollectionsKt.f0(influences);
        for (C1342Jz0 c1342Jz0 : influences) {
            if (c1342Jz0.getInfluenceType().isDisabled()) {
                NS0.debug$default("OutcomeEventsController.removeDisabledInfluences: Outcomes disabled for channel: " + c1342Jz0.getInfluenceChannel(), null, 2, null);
                arrayListF0.remove(c1342Jz0);
            }
        }
        return arrayListF0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object requestMeasureOutcomeEvent(C8058za1 c8058za1, JM<? super Unit> jm) throws C7063up {
        Boolean bool;
        String appId = this._configModelStore.getModel().getAppId();
        String id = this._subscriptionManager.getSubscriptions().getPush().getId();
        String value = EU1.INSTANCE.fromDeviceType(this._deviceService.getDeviceType()).getValue();
        if (id.length() == 0 || value.length() == 0) {
            throw new C7063up(0, null, null, 6, null);
        }
        C7848ya1 c7848ya1FromOutcomeEventParamstoOutcomeEvent = C7848ya1.INSTANCE.fromOutcomeEventParamstoOutcomeEvent(c8058za1);
        int i = a.$EnumSwitchMapping$0[c7848ya1FromOutcomeEventParamstoOutcomeEvent.getSession().ordinal()];
        if (i != 1) {
            bool = i != 2 ? null : Boolean.FALSE;
        } else {
            bool = Boolean.TRUE;
        }
        Object objSendOutcomeEvent = this._outcomeEventsBackend.sendOutcomeEvent(appId, this._identityModelStore.getModel().getOnesignalId(), id, value, bool, c7848ya1FromOutcomeEventParamstoOutcomeEvent, jm);
        return objSendOutcomeEvent == MN.d ? objSendOutcomeEvent : Unit.a;
    }

    private final void saveAttributedUniqueOutcomeNotifications(C8058za1 eventParams) {
        LY1.suspendifyOnThread(10, new c(eventParams, null));
    }

    private final void saveUnattributedUniqueOutcomeEvents() {
        this._outcomeEventsPreferences.setUnattributedUniqueOutcomeEventsSentByChannel(this.unattributedUniqueOutcomeEventsSentOnSession);
    }

    private final void saveUniqueOutcome(C8058za1 eventParams) {
        if (eventParams.isUnattributed()) {
            saveUnattributedUniqueOutcomeEvents();
        } else {
            saveAttributedUniqueOutcomeNotifications(eventParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:59:0x0139 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object sendAndCreateOutcomeEvent(String str, float f2, long j, List<C1342Jz0> list, JM<? super C7848ya1> jm) {
        d dVar;
        String str2;
        long j2;
        C8058za1 c8058za1;
        C0644Ba1 c0644Ba1;
        String str3;
        InterfaceC5187lu0 interfaceC5187lu0;
        if (jm instanceof d) {
            dVar = (d) jm;
            int i = dVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.label = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(jm);
            }
        } else {
            dVar = new d(jm);
        }
        Object obj = dVar.result;
        MN mn = MN.d;
        int i2 = dVar.label;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            long currentTimeMillis = this._time.getCurrentTimeMillis() / ((long) CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
            boolean z = false;
            C0956Fa1 sourceChannelIds = null;
            C0956Fa1 sourceChannelIds2 = null;
            for (C1342Jz0 c1342Jz0 : list) {
                int i3 = a.$EnumSwitchMapping$0[c1342Jz0.getInfluenceType().ordinal()];
                if (i3 == 1) {
                    if (sourceChannelIds == null) {
                        sourceChannelIds = new C0956Fa1(null, null, 3, null);
                    }
                    sourceChannelIds = setSourceChannelIds(c1342Jz0, sourceChannelIds);
                } else if (i3 == 2) {
                    if (sourceChannelIds2 == null) {
                        sourceChannelIds2 = new C0956Fa1(null, null, 3, null);
                    }
                    sourceChannelIds2 = setSourceChannelIds(c1342Jz0, sourceChannelIds2);
                } else if (i3 == 3) {
                    z = true;
                } else if (i3 == 4) {
                    NS0.verbose$default("OutcomeEventsController.sendAndCreateOutcomeEvent: Outcomes disabled for channel: " + c1342Jz0.getInfluenceChannel(), null, 2, null);
                }
            }
            if (sourceChannelIds == null && sourceChannelIds2 == null && !z) {
                NS0.verbose$default("OutcomeEventsController.sendAndCreateOutcomeEvent: Outcomes disabled for all channels", null, 2, null);
                return null;
            }
            C8058za1 c8058za2 = new C8058za1(str, new C0878Ea1(sourceChannelIds, sourceChannelIds2), f2, j, 0L);
            try {
                dVar.L$0 = this;
                str2 = str;
                try {
                    dVar.L$1 = str2;
                    dVar.L$2 = c8058za2;
                    dVar.J$0 = currentTimeMillis;
                    dVar.label = 1;
                    if (requestMeasureOutcomeEvent(c8058za2, dVar) != mn) {
                        j2 = currentTimeMillis;
                        c8058za1 = c8058za2;
                        str3 = str2;
                        c0644Ba1 = this;
                    }
                } catch (C7063up e2) {
                    e = e2;
                    j2 = currentTimeMillis;
                    c8058za1 = c8058za2;
                    c0644Ba1 = this;
                    StringBuilder sbB = C6495s7.b("OutcomeEventsController.sendAndCreateOutcomeEvent: Sending outcome with name: ", str2, " failed with status code: ");
                    sbB.append(e.getStatusCode());
                    sbB.append(" and response: ");
                    sbB.append(e.getResponse());
                    sbB.append("\nOutcome event was cached and will be reattempted on app cold start");
                    NS0.warn$default(sbB.toString(), null, 2, null);
                    c8058za1.setTimestamp(j2);
                    interfaceC5187lu0 = c0644Ba1._outcomeEventsCache;
                    dVar.L$0 = null;
                    dVar.L$1 = null;
                    dVar.L$2 = null;
                    dVar.label = 2;
                    if (interfaceC5187lu0.saveOutcomeEvent(c8058za1, dVar) != mn) {
                        return null;
                    }
                }
            } catch (C7063up e3) {
                e = e3;
                str2 = str;
            }
            return mn;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            return null;
        }
        j2 = dVar.J$0;
        c8058za1 = (C8058za1) dVar.L$2;
        str3 = (String) dVar.L$1;
        c0644Ba1 = (C0644Ba1) dVar.L$0;
        try {
            C1795Pt1.b(obj);
        } catch (C7063up e4) {
            e = e4;
            str2 = str3;
            StringBuilder sbB2 = C6495s7.b("OutcomeEventsController.sendAndCreateOutcomeEvent: Sending outcome with name: ", str2, " failed with status code: ");
            sbB2.append(e.getStatusCode());
            sbB2.append(" and response: ");
            sbB2.append(e.getResponse());
            sbB2.append("\nOutcome event was cached and will be reattempted on app cold start");
            NS0.warn$default(sbB2.toString(), null, 2, null);
            c8058za1.setTimestamp(j2);
            interfaceC5187lu0 = c0644Ba1._outcomeEventsCache;
            dVar.L$0 = null;
            dVar.L$1 = null;
            dVar.L$2 = null;
            dVar.label = 2;
            if (interfaceC5187lu0.saveOutcomeEvent(c8058za1, dVar) != mn) {
                return mn;
            }
            return null;
        }
        c0644Ba1.saveUniqueOutcome(c8058za1);
        return C7848ya1.INSTANCE.fromOutcomeEventParamstoOutcomeEvent(c8058za1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        if (r8.deleteOldOutcomeEvent(r7, r0) == r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendSavedOutcomeEvent(defpackage.C8058za1 r7, defpackage.JM<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.C0644Ba1.e
            if (r0 == 0) goto L13
            r0 = r8
            Ba1$e r0 = (defpackage.C0644Ba1.e) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            Ba1$e r0 = new Ba1$e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            MN r1 = defpackage.MN.d
            int r2 = r0.label
            r3 = 1
            r4 = 0
            r5 = 2
            if (r2 == 0) goto L45
            if (r2 == r3) goto L39
            if (r2 != r5) goto L31
            java.lang.Object r7 = r0.L$0
            za1 r7 = (defpackage.C8058za1) r7
            defpackage.C1795Pt1.b(r8)     // Catch: defpackage.C7063up -> L2f
            goto L97
        L2f:
            r8 = move-exception
            goto L65
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            java.lang.Object r7 = r0.L$1
            za1 r7 = (defpackage.C8058za1) r7
            java.lang.Object r2 = r0.L$0
            Ba1 r2 = (defpackage.C0644Ba1) r2
            defpackage.C1795Pt1.b(r8)     // Catch: defpackage.C7063up -> L2f
            goto L56
        L45:
            defpackage.C1795Pt1.b(r8)
            r0.L$0 = r6     // Catch: defpackage.C7063up -> L2f
            r0.L$1 = r7     // Catch: defpackage.C7063up -> L2f
            r0.label = r3     // Catch: defpackage.C7063up -> L2f
            java.lang.Object r8 = r6.requestMeasureOutcomeEvent(r7, r0)     // Catch: defpackage.C7063up -> L2f
            if (r8 != r1) goto L55
            goto L64
        L55:
            r2 = r6
        L56:
            lu0 r8 = r2._outcomeEventsCache     // Catch: defpackage.C7063up -> L2f
            r0.L$0 = r7     // Catch: defpackage.C7063up -> L2f
            r0.L$1 = r4     // Catch: defpackage.C7063up -> L2f
            r0.label = r5     // Catch: defpackage.C7063up -> L2f
            java.lang.Object r7 = r8.deleteOldOutcomeEvent(r7, r0)     // Catch: defpackage.C7063up -> L2f
            if (r7 != r1) goto L97
        L64:
            return r1
        L65:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "OutcomeEventsController.sendSavedOutcomeEvent: Sending outcome with name: "
            r0.<init>(r1)
            java.lang.String r7 = r7.getOutcomeId()
            r0.append(r7)
            java.lang.String r7 = " failed with status code: "
            r0.append(r7)
            int r7 = r8.getStatusCode()
            r0.append(r7)
            java.lang.String r7 = " and response: "
            r0.append(r7)
            java.lang.String r7 = r8.getResponse()
            r0.append(r7)
            java.lang.String r7 = "\nOutcome event was cached and will be reattempted on app cold start"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            defpackage.NS0.warn$default(r7, r4, r5, r4)
        L97:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0644Ba1.sendSavedOutcomeEvent(za1, JM):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:29:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:? A[LOOP:0: B:21:0x005b->B:31:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object sendSavedOutcomes(JM<? super Unit> jm) {
        f fVar;
        C0644Ba1 c0644Ba1;
        C0644Ba1 c0644Ba2;
        Iterator it;
        C8058za1 c8058za1;
        if (jm instanceof f) {
            fVar = (f) jm;
            int i = fVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fVar.label = i - Integer.MIN_VALUE;
            } else {
                fVar = new f(jm);
            }
        } else {
            fVar = new f(jm);
        }
        Object allEventsToSend = fVar.result;
        MN mn = MN.d;
        int i2 = fVar.label;
        if (i2 == 0) {
            C1795Pt1.b(allEventsToSend);
            InterfaceC5187lu0 interfaceC5187lu0 = this._outcomeEventsCache;
            fVar.L$0 = this;
            fVar.label = 1;
            allEventsToSend = interfaceC5187lu0.getAllEventsToSend(fVar);
            if (allEventsToSend != mn) {
                c0644Ba1 = this;
            }
            return mn;
        }
        if (i2 == 1) {
            c0644Ba1 = (C0644Ba1) fVar.L$0;
            C1795Pt1.b(allEventsToSend);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) fVar.L$1;
            c0644Ba2 = (C0644Ba1) fVar.L$0;
            C1795Pt1.b(allEventsToSend);
        }
        while (it.hasNext()) {
            c8058za1 = (C8058za1) it.next();
            fVar.L$0 = c0644Ba2;
            fVar.L$1 = it;
            fVar.label = 2;
            if (c0644Ba2.sendSavedOutcomeEvent(c8058za1, fVar) == mn) {
                return mn;
            }
        }
        return Unit.a;
        c0644Ba2 = c0644Ba1;
        it = ((List) allEventsToSend).iterator();
        while (it.hasNext()) {
            c8058za1 = (C8058za1) it.next();
            fVar.L$0 = c0644Ba2;
            fVar.L$1 = it;
            fVar.label = 2;
            if (c0644Ba2.sendSavedOutcomeEvent(c8058za1, fVar) == mn) {
                return mn;
            }
        }
        return Unit.a;
    }

    private final C0956Fa1 setSourceChannelIds(C1342Jz0 influence, C0956Fa1 sourceBody) {
        int i = a.$EnumSwitchMapping$1[influence.getInfluenceChannel().ordinal()];
        if (i == 1) {
            sourceBody.setInAppMessagesIds(influence.getIds());
            return sourceBody;
        }
        if (i != 2) {
            return sourceBody;
        }
        sourceBody.setNotificationIds(influence.getIds());
        return sourceBody;
    }

    @Override // defpackage.InterfaceC1797Pu0
    public void onSessionStarted() {
        NS0.debug$default("OutcomeEventsController.sessionStarted: Cleaning outcomes for new session", null, 2, null);
        this.unattributedUniqueOutcomeEventsSentOnSession = new LinkedHashSet();
        saveUnattributedUniqueOutcomeEvents();
    }

    @Override // defpackage.InterfaceC4767ju0
    @Nullable
    public Object sendOutcomeEvent(@NotNull String str, @NotNull JM<? super C7848ya1> jm) {
        return sendAndCreateOutcomeEvent(str, 0.0f, 0L, this._influenceManager.getInfluences(), jm);
    }

    @Override // defpackage.InterfaceC4767ju0
    @Nullable
    public Object sendOutcomeEventWithValue(@NotNull String str, float f2, @NotNull JM<? super C7848ya1> jm) {
        return sendAndCreateOutcomeEvent(str, f2, 0L, this._influenceManager.getInfluences(), jm);
    }

    @Override // defpackage.InterfaceC4767ju0
    @Nullable
    public Object sendSessionEndOutcomeEvent(long j, @NotNull JM<? super C7848ya1> jm) {
        List<C1342Jz0> influences = this._influenceManager.getInfluences();
        Iterator<C1342Jz0> it = influences.iterator();
        while (it.hasNext()) {
            if (it.next().getIds() != null) {
                return sendAndCreateOutcomeEvent("os__session_duration", 0.0f, j, influences, jm);
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC4767ju0
    @Nullable
    public Object sendUniqueOutcomeEvent(@NotNull String str, @NotNull JM<? super C7848ya1> jm) {
        return sendUniqueOutcomeEvent(str, this._influenceManager.getInfluences(), jm);
    }

    @Override // defpackage.InterfaceC2529Yu0
    public void start() {
        LY1.suspendifyOnThread$default(0, new h(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object sendUniqueOutcomeEvent(String str, List<C1342Jz0> list, JM<? super C7848ya1> jm) {
        g gVar;
        List<C1342Jz0> listRemoveDisabledInfluences;
        C0644Ba1 c0644Ba1;
        if (jm instanceof g) {
            gVar = (g) jm;
            int i = gVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                gVar.label = i - Integer.MIN_VALUE;
            } else {
                gVar = new g(jm);
            }
        } else {
            gVar = new g(jm);
        }
        g gVar2 = gVar;
        Object uniqueIds = gVar2.result;
        MN mn = MN.d;
        int i2 = gVar2.label;
        if (i2 == 0) {
            C1795Pt1.b(uniqueIds);
            listRemoveDisabledInfluences = removeDisabledInfluences(list);
            if (listRemoveDisabledInfluences.isEmpty()) {
                NS0.debug$default("OutcomeEventsController.sendUniqueOutcomeEvent: Unique Outcome disabled for current session", null, 2, null);
                return null;
            }
            Iterator<C1342Jz0> it = listRemoveDisabledInfluences.iterator();
            do {
                if (!it.hasNext()) {
                    if (this.unattributedUniqueOutcomeEventsSentOnSession.contains(str)) {
                        NS0.debug$default(DS1.b("\n                    Measure endpoint will not send because unique outcome already sent for: \n                    Session: " + EnumC1890Qz0.UNATTRIBUTED + "\n                    Outcome name: " + str + "\n                    "), null, 2, null);
                        return null;
                    }
                    this.unattributedUniqueOutcomeEventsSentOnSession.add(str);
                    gVar2.label = 3;
                    Object objSendAndCreateOutcomeEvent = sendAndCreateOutcomeEvent(str, 0.0f, 0L, listRemoveDisabledInfluences, gVar2);
                    if (objSendAndCreateOutcomeEvent != mn) {
                        return objSendAndCreateOutcomeEvent;
                    }
                }
            } while (!it.next().getInfluenceType().isAttributed());
            gVar2.L$0 = this;
            gVar2.L$1 = str;
            gVar2.L$2 = listRemoveDisabledInfluences;
            gVar2.label = 1;
            uniqueIds = getUniqueIds(str, listRemoveDisabledInfluences, gVar2);
            if (uniqueIds != mn) {
                c0644Ba1 = this;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                C1795Pt1.b(uniqueIds);
                return uniqueIds;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(uniqueIds);
            return uniqueIds;
        }
        List<C1342Jz0> list2 = (List) gVar2.L$2;
        String str2 = (String) gVar2.L$1;
        c0644Ba1 = (C0644Ba1) gVar2.L$0;
        C1795Pt1.b(uniqueIds);
        listRemoveDisabledInfluences = list2;
        str = str2;
        List<C1342Jz0> list3 = (List) uniqueIds;
        if (list3 == null) {
            NS0.debug$default(DS1.b("\n                    Measure endpoint will not send because unique outcome already sent for: \n                    SessionInfluences: " + listRemoveDisabledInfluences + "\n                    Outcome name: " + str + "\n                    "), null, 2, null);
            return null;
        }
        gVar2.L$0 = null;
        gVar2.L$1 = null;
        gVar2.L$2 = null;
        gVar2.label = 2;
        Object objSendAndCreateOutcomeEvent2 = c0644Ba1.sendAndCreateOutcomeEvent(str, 0.0f, 0L, list3, gVar2);
        return objSendAndCreateOutcomeEvent2 == mn ? mn : objSendAndCreateOutcomeEvent2;
    }

    @Override // defpackage.InterfaceC1797Pu0
    public void onSessionActive() {
    }

    @Override // defpackage.InterfaceC1797Pu0
    public void onSessionEnded(long duration) {
    }
}
