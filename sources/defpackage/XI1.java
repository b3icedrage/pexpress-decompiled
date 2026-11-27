package defpackage;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B'\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u0013\u0010\u0015\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001b\u0010\u0012J\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001c0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010/R\u0014\u00104\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0016\u00107\u001a\u0004\u0018\u0001018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u0010:\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006;"}, d2 = {"LXI1;", "LRu0;", "Lcs0;", "LYu0;", "LYr0;", "LVr0;", "LWr0;", "_applicationService", "LxI;", "_configModelStore", "LMI1;", "_sessionModelStore", "Lgv0;", "_time", "<init>", "(LWr0;LxI;LMI1;Lgv0;)V", "", "endSession", "()V", "bootstrap", "start", "backgroundRun", "(LJM;)Ljava/lang/Object;", "", "firedOnSubscribe", "onFocus", "(Z)V", "onUnfocused", "LPu0;", "handler", "subscribe", "(LPu0;)V", "unsubscribe", "LWr0;", "LxI;", "LMI1;", "Lgv0;", "LO80;", "sessionLifeCycleNotifier", "LO80;", "LLI1;", "session", "LLI1;", "LwI;", "config", "LwI;", "shouldFireOnSubscribe", "Z", "hasFocused", "", "getStartTime", "()J", "startTime", "getScheduleBackgroundRunIn", "()Ljava/lang/Long;", "scheduleBackgroundRunIn", "getHasSubscribers", "()Z", "hasSubscribers", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class XI1 implements InterfaceC1953Ru0, InterfaceC3244cs0, InterfaceC2529Yu0, InterfaceC2520Yr0, InterfaceC2256Vr0 {

    @NotNull
    private final InterfaceC2338Wr0 _applicationService;

    @NotNull
    private final C7582xI _configModelStore;

    @NotNull
    private final MI1 _sessionModelStore;

    @NotNull
    private final InterfaceC4092gv0 _time;

    @Nullable
    private C7371wI config;
    private boolean hasFocused;

    @Nullable
    private LI1 session;

    @NotNull
    private final O80<InterfaceC1797Pu0> sessionLifeCycleNotifier;
    private boolean shouldFireOnSubscribe;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LPu0;", "it", "", "invoke", "(LPu0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class a extends ML0 implements Function1<InterfaceC1797Pu0, Unit> {
        final /* synthetic */ long $activeDuration;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j) {
            super(1);
            this.$activeDuration = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC1797Pu0 interfaceC1797Pu0) {
            invoke2(interfaceC1797Pu0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC1797Pu0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onSessionEnded(this.$activeDuration);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LPu0;", "it", "", "invoke", "(LPu0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class b extends ML0 implements Function1<InterfaceC1797Pu0, Unit> {
        public static final b INSTANCE = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC1797Pu0 interfaceC1797Pu0) {
            invoke2(interfaceC1797Pu0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC1797Pu0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onSessionStarted();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LPu0;", "it", "", "invoke", "(LPu0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class c extends ML0 implements Function1<InterfaceC1797Pu0, Unit> {
        public static final c INSTANCE = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC1797Pu0 interfaceC1797Pu0) {
            invoke2(interfaceC1797Pu0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC1797Pu0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onSessionActive();
        }
    }

    public XI1(@NotNull InterfaceC2338Wr0 _applicationService, @NotNull C7582xI _configModelStore, @NotNull MI1 _sessionModelStore, @NotNull InterfaceC4092gv0 _time) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_sessionModelStore, "_sessionModelStore");
        Intrinsics.checkNotNullParameter(_time, "_time");
        this._applicationService = _applicationService;
        this._configModelStore = _configModelStore;
        this._sessionModelStore = _sessionModelStore;
        this._time = _time;
        this.sessionLifeCycleNotifier = new O80<>();
    }

    private final void endSession() {
        LI1 li1 = this.session;
        Intrinsics.checkNotNull(li1);
        if (li1.isValid()) {
            LI1 li2 = this.session;
            Intrinsics.checkNotNull(li2);
            long activeDuration = li2.getActiveDuration();
            NS0.debug$default(C6419rl.a("SessionService.backgroundRun: Session ended. activeDuration: ", activeDuration), null, 2, null);
            LI1 li3 = this.session;
            Intrinsics.checkNotNull(li3);
            li3.setValid(false);
            this.sessionLifeCycleNotifier.fire(new a(activeDuration));
            LI1 li4 = this.session;
            Intrinsics.checkNotNull(li4);
            li4.setActiveDuration(0L);
        }
    }

    @Override // defpackage.InterfaceC2520Yr0
    @Nullable
    public Object backgroundRun(@NotNull JM<? super Unit> jm) {
        endSession();
        return Unit.a;
    }

    @Override // defpackage.InterfaceC3244cs0
    public void bootstrap() {
        this.session = this._sessionModelStore.getModel();
        this.config = this._configModelStore.getModel();
    }

    @Override // defpackage.InterfaceC1953Ru0, defpackage.InterfaceC0775Cs0
    public boolean getHasSubscribers() {
        return this.sessionLifeCycleNotifier.getHasSubscribers();
    }

    @Override // defpackage.InterfaceC2520Yr0
    @Nullable
    public Long getScheduleBackgroundRunIn() {
        LI1 li1 = this.session;
        Intrinsics.checkNotNull(li1);
        if (!li1.isValid()) {
            return null;
        }
        C7371wI c7371wI = this.config;
        Intrinsics.checkNotNull(c7371wI);
        return Long.valueOf(c7371wI.getSessionFocusTimeout());
    }

    @Override // defpackage.InterfaceC1953Ru0
    public long getStartTime() {
        LI1 li1 = this.session;
        Intrinsics.checkNotNull(li1);
        return li1.getStartTime();
    }

    @Override // defpackage.InterfaceC2256Vr0
    public void onFocus(boolean firedOnSubscribe) {
        NS0.log(EnumC5513nS0.DEBUG, "SessionService.onFocus() - fired from start: " + firedOnSubscribe);
        if (!this.hasFocused) {
            this.hasFocused = true;
            endSession();
        }
        LI1 li1 = this.session;
        Intrinsics.checkNotNull(li1);
        if (li1.isValid()) {
            LI1 li2 = this.session;
            Intrinsics.checkNotNull(li2);
            li2.setFocusTime(this._time.getCurrentTimeMillis());
            this.sessionLifeCycleNotifier.fire(c.INSTANCE);
            return;
        }
        this.shouldFireOnSubscribe = firedOnSubscribe;
        LI1 li3 = this.session;
        Intrinsics.checkNotNull(li3);
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        li3.setSessionId(string);
        LI1 li4 = this.session;
        Intrinsics.checkNotNull(li4);
        li4.setStartTime(this._time.getCurrentTimeMillis());
        LI1 li5 = this.session;
        Intrinsics.checkNotNull(li5);
        LI1 li6 = this.session;
        Intrinsics.checkNotNull(li6);
        li5.setFocusTime(li6.getStartTime());
        LI1 li7 = this.session;
        Intrinsics.checkNotNull(li7);
        li7.setValid(true);
        StringBuilder sb = new StringBuilder("SessionService: New session started at ");
        LI1 li8 = this.session;
        Intrinsics.checkNotNull(li8);
        sb.append(li8.getStartTime());
        NS0.debug$default(sb.toString(), null, 2, null);
        this.sessionLifeCycleNotifier.fire(b.INSTANCE);
    }

    @Override // defpackage.InterfaceC2256Vr0
    public void onUnfocused() {
        long currentTimeMillis = this._time.getCurrentTimeMillis();
        LI1 li1 = this.session;
        Intrinsics.checkNotNull(li1);
        long focusTime = currentTimeMillis - li1.getFocusTime();
        LI1 li2 = this.session;
        Intrinsics.checkNotNull(li2);
        li2.setActiveDuration(li2.getActiveDuration() + focusTime);
        EnumC5513nS0 enumC5513nS0 = EnumC5513nS0.DEBUG;
        StringBuilder sb = new StringBuilder("SessionService.onUnfocused adding time ");
        sb.append(focusTime);
        sb.append(" for total: ");
        LI1 li3 = this.session;
        Intrinsics.checkNotNull(li3);
        sb.append(li3.getActiveDuration());
        NS0.log(enumC5513nS0, sb.toString());
    }

    @Override // defpackage.InterfaceC2529Yu0
    public void start() {
        this._applicationService.addApplicationLifecycleHandler(this);
    }

    @Override // defpackage.InterfaceC1953Ru0, defpackage.InterfaceC0775Cs0
    public void subscribe(@NotNull InterfaceC1797Pu0 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.sessionLifeCycleNotifier.subscribe(handler);
        if (this.shouldFireOnSubscribe) {
            handler.onSessionStarted();
        }
    }

    @Override // defpackage.InterfaceC1953Ru0, defpackage.InterfaceC0775Cs0
    public void unsubscribe(@NotNull InterfaceC1797Pu0 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.sessionLifeCycleNotifier.unsubscribe(handler);
    }
}
