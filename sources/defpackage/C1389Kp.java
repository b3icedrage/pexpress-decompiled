package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import com.onesignal.core.services.SyncJobService;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Kp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 62\u00020\u00012\u00020\u00022\u00020\u0003:\u00017B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u0014J\u000f\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u000fJ\u000f\u0010\u001c\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u000fJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\rH\u0016¢\u0006\u0004\b \u0010\u000fJ\u0013\u0010!\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0016H\u0016¢\u0006\u0004\b#\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010&R\"\u0010'\u001a\u00020\u00168\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010\u001fR\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00104\u001a\u0006\u0012\u0002\b\u0003038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105\u0082\u0002\u0004\n\u0002\b\u0019¨\u00068"}, d2 = {"LKp;", "LVr0;", "LXr0;", "LYu0;", "LWr0;", "_applicationService", "Lgv0;", "_time", "", "LYr0;", "_backgroundServices", "<init>", "(LWr0;Lgv0;Ljava/util/List;)V", "", "scheduleBackground", "()V", "cancelSyncTask", "", "delayMs", "scheduleSyncTask", "(J)V", "scheduleBackgroundSyncTask", "", "hasBootPermission", "()Z", "isJobIdRunning", "scheduleSyncServiceAsJob", "cancelBackgroundSyncTask", "start", "firedOnSubscribe", "onFocus", "(Z)V", "onUnfocused", "runBackgroundServices", "(LJM;)Ljava/lang/Object;", "cancelRunBackgroundServices", "LWr0;", "Lgv0;", "Ljava/util/List;", "needsJobReschedule", "Z", "getNeedsJobReschedule", "setNeedsJobReschedule", "", "lock", "Ljava/lang/Object;", "nextScheduledSyncTimeMs", "J", "LXF0;", "backgroundSyncJob", "LXF0;", "Ljava/lang/Class;", "syncServiceJobClass", "Ljava/lang/Class;", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C1389Kp implements InterfaceC2256Vr0, InterfaceC2442Xr0, InterfaceC2529Yu0 {
    private static final int SYNC_TASK_ID = 2071862118;

    @NotNull
    private final InterfaceC2338Wr0 _applicationService;

    @NotNull
    private final List<InterfaceC2520Yr0> _backgroundServices;

    @NotNull
    private final InterfaceC4092gv0 _time;

    @Nullable
    private XF0 backgroundSyncJob;

    @NotNull
    private final Object lock;
    private boolean needsJobReschedule;
    private long nextScheduledSyncTimeMs;

    @NotNull
    private final Class<?> syncServiceJobClass;

    /* JADX INFO: renamed from: Kp$b */
    @InterfaceC3368dU(c = "com.onesignal.core.internal.background.impl.BackgroundManager$runBackgroundServices$2", f = "BackgroundManager.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: Kp$b$a */
        @InterfaceC3368dU(c = "com.onesignal.core.internal.background.impl.BackgroundManager$runBackgroundServices$2$1", f = "BackgroundManager.kt", l = {116}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
        public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            Object L$0;
            int label;
            final /* synthetic */ C1389Kp this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C1389Kp c1389Kp, JM<? super a> jm) {
                super(2, jm);
                this.this$0 = c1389Kp;
            }

            @Override // defpackage.AbstractC7487wq
            @NotNull
            public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
                return new a(this.this$0, jm);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
                return ((a) create(kn, jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Iterator it;
                MN mn = MN.d;
                int i = this.label;
                if (i == 0) {
                    C1795Pt1.b(obj);
                    Object obj2 = this.this$0.lock;
                    C1389Kp c1389Kp = this.this$0;
                    synchronized (obj2) {
                        c1389Kp.nextScheduledSyncTimeMs = 0L;
                        Unit unit = Unit.a;
                    }
                    it = this.this$0._backgroundServices.iterator();
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) this.L$0;
                    C1795Pt1.b(obj);
                }
                while (it.hasNext()) {
                    InterfaceC2520Yr0 interfaceC2520Yr0 = (InterfaceC2520Yr0) it.next();
                    this.L$0 = it;
                    this.label = 1;
                    if (interfaceC2520Yr0.backgroundRun(this) == mn) {
                        return mn;
                    }
                }
                this.this$0.scheduleBackground();
                return Unit.a;
            }
        }

        public b(JM<? super b> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            b bVar = C1389Kp.this.new b(jm);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            KN kn = (KN) this.L$0;
            NS0.debug$default("OSBackground sync, calling initWithContext", null, 2, null);
            C1389Kp c1389Kp = C1389Kp.this;
            c1389Kp.backgroundSyncJob = C5189lv.k(kn, C6266r20.b, new a(c1389Kp, null), 2);
            return Unit.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1389Kp(@NotNull InterfaceC2338Wr0 _applicationService, @NotNull InterfaceC4092gv0 _time, @NotNull List<? extends InterfaceC2520Yr0> _backgroundServices) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_time, "_time");
        Intrinsics.checkNotNullParameter(_backgroundServices, "_backgroundServices");
        this._applicationService = _applicationService;
        this._time = _time;
        this._backgroundServices = _backgroundServices;
        this.lock = new Object();
        this.syncServiceJobClass = SyncJobService.class;
    }

    private final void cancelBackgroundSyncTask() {
        NS0.debug$default(C1389Kp.class.getSimpleName().concat(" cancel background sync"), null, 2, null);
        synchronized (this.lock) {
            Object systemService = this._applicationService.getAppContext().getSystemService("jobscheduler");
            Intrinsics.c(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
            ((JobScheduler) systemService).cancel(SYNC_TASK_ID);
            Unit unit = Unit.a;
        }
    }

    private final void cancelSyncTask() {
        synchronized (this.lock) {
            this.nextScheduledSyncTimeMs = 0L;
            cancelBackgroundSyncTask();
            Unit unit = Unit.a;
        }
    }

    private final boolean hasBootPermission() {
        return C6333rM.checkSelfPermission(this._applicationService.getAppContext(), "android.permission.RECEIVE_BOOT_COMPLETED") == 0;
    }

    private final boolean isJobIdRunning() {
        XF0 xf0;
        Object systemService = this._applicationService.getAppContext().getSystemService("jobscheduler");
        Intrinsics.c(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        Iterator<JobInfo> it = ((JobScheduler) systemService).getAllPendingJobs().iterator();
        while (it.hasNext()) {
            if (it.next().getId() == SYNC_TASK_ID && (xf0 = this.backgroundSyncJob) != null) {
                Intrinsics.checkNotNull(xf0);
                if (xf0.g()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleBackground() {
        Iterator<InterfaceC2520Yr0> it = this._backgroundServices.iterator();
        Long l = null;
        while (it.hasNext()) {
            Long scheduleBackgroundRunIn = it.next().getScheduleBackgroundRunIn();
            if (scheduleBackgroundRunIn != null && (l == null || scheduleBackgroundRunIn.longValue() < l.longValue())) {
                l = scheduleBackgroundRunIn;
            }
        }
        if (l != null) {
            scheduleSyncTask(l.longValue());
        }
    }

    private final void scheduleBackgroundSyncTask(long delayMs) {
        synchronized (this.lock) {
            scheduleSyncServiceAsJob(delayMs);
            Unit unit = Unit.a;
        }
    }

    private final void scheduleSyncServiceAsJob(long delayMs) {
        NS0.debug$default(C6419rl.a("OSBackgroundSync scheduleSyncServiceAsJob:atTime: ", delayMs), null, 2, null);
        if (isJobIdRunning()) {
            NS0.verbose$default("OSBackgroundSync scheduleSyncServiceAsJob Scheduler already running!", null, 2, null);
            setNeedsJobReschedule(true);
            return;
        }
        Context appContext = this._applicationService.getAppContext();
        Intrinsics.checkNotNull(appContext);
        Class<?> cls = this.syncServiceJobClass;
        Intrinsics.checkNotNull(cls);
        JobInfo.Builder builder = new JobInfo.Builder(SYNC_TASK_ID, new ComponentName(appContext, cls));
        builder.setMinimumLatency(delayMs).setRequiredNetworkType(1);
        if (hasBootPermission()) {
            builder.setPersisted(true);
        }
        Context appContext2 = this._applicationService.getAppContext();
        Intrinsics.checkNotNull(appContext2);
        Object systemService = appContext2.getSystemService("jobscheduler");
        Intrinsics.c(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        try {
            NS0.info$default("OSBackgroundSync scheduleSyncServiceAsJob:result: " + ((JobScheduler) systemService).schedule(builder.build()), null, 2, null);
        } catch (NullPointerException e) {
            NS0.error("scheduleSyncServiceAsJob called JobScheduler.jobScheduler which triggered an internal null Android error. Skipping job.", e);
        }
    }

    private final void scheduleSyncTask(long delayMs) {
        synchronized (this.lock) {
            if (this.nextScheduledSyncTimeMs != 0 && this._time.getCurrentTimeMillis() + delayMs > this.nextScheduledSyncTimeMs) {
                NS0.debug$default("OSSyncService scheduleSyncTask already update scheduled nextScheduledSyncTimeMs: " + this.nextScheduledSyncTimeMs, null, 2, null);
            } else {
                if (delayMs < 5000) {
                    delayMs = 5000;
                }
                scheduleBackgroundSyncTask(delayMs);
                this.nextScheduledSyncTimeMs = this._time.getCurrentTimeMillis() + delayMs;
                Unit unit = Unit.a;
            }
        }
    }

    @Override // defpackage.InterfaceC2442Xr0
    public boolean cancelRunBackgroundServices() {
        XF0 xf0 = this.backgroundSyncJob;
        if (xf0 == null) {
            return false;
        }
        Intrinsics.checkNotNull(xf0);
        if (!xf0.g()) {
            return false;
        }
        XF0 xf1 = this.backgroundSyncJob;
        Intrinsics.checkNotNull(xf1);
        xf1.l(null);
        return true;
    }

    @Override // defpackage.InterfaceC2442Xr0
    public boolean getNeedsJobReschedule() {
        return this.needsJobReschedule;
    }

    @Override // defpackage.InterfaceC2256Vr0
    public void onFocus(boolean firedOnSubscribe) {
        cancelSyncTask();
    }

    @Override // defpackage.InterfaceC2256Vr0
    public void onUnfocused() {
        scheduleBackground();
    }

    @Override // defpackage.InterfaceC2442Xr0
    @Nullable
    public Object runBackgroundServices(@NotNull JM<? super Unit> jm) {
        Object objD = LN.d(new b(null), jm);
        return objD == MN.d ? objD : Unit.a;
    }

    @Override // defpackage.InterfaceC2442Xr0
    public void setNeedsJobReschedule(boolean z) {
        this.needsJobReschedule = z;
    }

    @Override // defpackage.InterfaceC2529Yu0
    public void start() {
        this._applicationService.addApplicationLifecycleHandler(this);
    }
}
