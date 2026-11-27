package defpackage;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00010B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\"R\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00061"}, d2 = {"LW40;", "LCs0;", "Llv0;", "Lpx0;", "_state", "LRu0;", "_session", "Lgv0;", "_time", "<init>", "(Lpx0;LRu0;Lgv0;)V", "", "timeInterval", "currentTimeInterval", "Li52$b;", "operator", "", "evaluateTimeIntervalWithOperator", "(DDLi52$b;)Z", "left", "right", "roughlyEqual", "(DD)Z", "Li52;", "trigger", "dynamicTriggerShouldFire", "(Li52;)Z", "handler", "", "subscribe", "(Llv0;)V", "unsubscribe", "Lpx0;", "LRu0;", "Lgv0;", "LO80;", "events", "LO80;", "getEvents", "()LO80;", "", "", "scheduledMessages", "Ljava/util/List;", "getHasSubscribers", "()Z", "hasSubscribers", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.inAppMessages"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class W40 implements InterfaceC0775Cs0<InterfaceC5190lv0> {
    private static final long DEFAULT_LAST_IN_APP_TIME_AGO = 999999;
    private static final double REQUIRED_ACCURACY = 0.3d;

    @NotNull
    private final InterfaceC1953Ru0 _session;

    @NotNull
    private final C6039px0 _state;

    @NotNull
    private final InterfaceC4092gv0 _time;

    @NotNull
    private final O80<InterfaceC5190lv0> events;

    @NotNull
    private final List<String> scheduledMessages;

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[C4340i52.a.values().length];
            iArr[C4340i52.a.SESSION_TIME.ordinal()] = 1;
            iArr[C4340i52.a.TIME_SINCE_LAST_IN_APP.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[C4340i52.b.values().length];
            iArr2[C4340i52.b.LESS_THAN.ordinal()] = 1;
            iArr2[C4340i52.b.LESS_THAN_OR_EQUAL_TO.ordinal()] = 2;
            iArr2[C4340i52.b.GREATER_THAN.ordinal()] = 3;
            iArr2[C4340i52.b.GREATER_THAN_OR_EQUAL_TO.ordinal()] = 4;
            iArr2[C4340i52.b.EQUAL_TO.ordinal()] = 5;
            iArr2[C4340i52.b.NOT_EQUAL_TO.ordinal()] = 6;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llv0;", "it", "", "invoke", "(Llv0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class c extends ML0 implements Function1<InterfaceC5190lv0, Unit> {
        final /* synthetic */ String $triggerId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.$triggerId = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5190lv0 interfaceC5190lv0) {
            invoke2(interfaceC5190lv0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC5190lv0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onTriggerCompleted(this.$triggerId);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"W40$d", "Ljava/util/TimerTask;", "", "run", "()V", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class d extends TimerTask {
        final /* synthetic */ String $triggerId;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llv0;", "it", "", "invoke", "(Llv0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class a extends ML0 implements Function1<InterfaceC5190lv0, Unit> {
            final /* synthetic */ String $triggerId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(1);
                this.$triggerId = str;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5190lv0 interfaceC5190lv0) {
                invoke2(interfaceC5190lv0);
                return Unit.a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InterfaceC5190lv0 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.onTriggerConditionChanged(this.$triggerId);
            }
        }

        public d(String str) {
            this.$triggerId = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            W40.this.scheduledMessages.remove(this.$triggerId);
            W40.this.getEvents().fire(new a(this.$triggerId));
        }
    }

    public W40(@NotNull C6039px0 _state, @NotNull InterfaceC1953Ru0 _session, @NotNull InterfaceC4092gv0 _time) {
        Intrinsics.checkNotNullParameter(_state, "_state");
        Intrinsics.checkNotNullParameter(_session, "_session");
        Intrinsics.checkNotNullParameter(_time, "_time");
        this._state = _state;
        this._session = _session;
        this._time = _time;
        this.events = new O80<>();
        this.scheduledMessages = new ArrayList();
    }

    private final boolean evaluateTimeIntervalWithOperator(double timeInterval, double currentTimeInterval, C4340i52.b operator) {
        switch (b.$EnumSwitchMapping$1[operator.ordinal()]) {
            case 1:
                return currentTimeInterval < timeInterval;
            case 2:
                return currentTimeInterval <= timeInterval || roughlyEqual(timeInterval, currentTimeInterval);
            case 3:
                return currentTimeInterval >= timeInterval;
            case 4:
                return currentTimeInterval >= timeInterval || roughlyEqual(timeInterval, currentTimeInterval);
            case 5:
                return roughlyEqual(timeInterval, currentTimeInterval);
            case 6:
                return !roughlyEqual(timeInterval, currentTimeInterval);
            default:
                NS0.error$default("Attempted to apply an invalid operator on a time-based in-app-message trigger: " + operator, null, 2, null);
                return false;
        }
    }

    private final boolean roughlyEqual(double left, double right) {
        return Math.abs(left - right) < REQUIRED_ACCURACY;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0089 A[Catch: all -> 0x0057, TRY_LEAVE, TryCatch #0 {all -> 0x0057, blocks: (B:7:0x0014, B:11:0x001e, B:29:0x0067, B:31:0x0089, B:38:0x009c, B:42:0x00a6, B:16:0x0034, B:20:0x003e, B:23:0x004a, B:28:0x0065, B:27:0x0059), top: B:47:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    /* JADX WARN: Code duplicated, block: B:36:0x009a A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:38:0x009c A[Catch: all -> 0x0057, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0057, blocks: (B:7:0x0014, B:11:0x001e, B:29:0x0067, B:31:0x0089, B:38:0x009c, B:42:0x00a6, B:16:0x0034, B:20:0x003e, B:23:0x004a, B:28:0x0065, B:27:0x0059), top: B:47:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a4 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a6 A[Catch: all -> 0x0057, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0057, blocks: (B:7:0x0014, B:11:0x001e, B:29:0x0067, B:31:0x0089, B:38:0x009c, B:42:0x00a6, B:16:0x0034, B:20:0x003e, B:23:0x004a, B:28:0x0065, B:27:0x0059), top: B:47:0x0014 }] */
    public final boolean dynamicTriggerShouldFire(@NotNull C4340i52 trigger) {
        long currentTimeMillis;
        long startTime;
        long j;
        long j2;
        String triggerId;
        long jDoubleValue;
        long j3;
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        if (trigger.getValue() == null) {
            return false;
        }
        synchronized (this.scheduledMessages) {
            try {
                if (!(trigger.getValue() instanceof Number)) {
                    return false;
                }
                int i = b.$EnumSwitchMapping$0[trigger.getKind().ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        j2 = 0;
                    } else {
                        if (this._state.getInAppMessageIdShowing() != null) {
                            return false;
                        }
                        Long lastTimeInAppDismissed = this._state.getLastTimeInAppDismissed();
                        if (lastTimeInAppDismissed == null) {
                            j = DEFAULT_LAST_IN_APP_TIME_AGO;
                        } else {
                            currentTimeMillis = this._time.getCurrentTimeMillis();
                            startTime = lastTimeInAppDismissed.longValue();
                        }
                        j2 = j;
                    }
                    triggerId = trigger.getTriggerId();
                    Number number = (Number) trigger.getValue();
                    Intrinsics.checkNotNull(number);
                    jDoubleValue = (long) (number.doubleValue() * ((double) CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT));
                    if (evaluateTimeIntervalWithOperator(jDoubleValue, j2, trigger.getOperatorType())) {
                        this.events.fire(new c(triggerId));
                        return true;
                    }
                    j3 = jDoubleValue - j2;
                    if (j3 <= 0) {
                        return false;
                    }
                    if (this.scheduledMessages.contains(triggerId)) {
                        return false;
                    }
                    X40.INSTANCE.scheduleTrigger(new d(triggerId), triggerId, j3);
                    this.scheduledMessages.add(triggerId);
                    return false;
                }
                currentTimeMillis = this._time.getCurrentTimeMillis();
                startTime = this._session.getStartTime();
                j = currentTimeMillis - startTime;
                j2 = j;
                triggerId = trigger.getTriggerId();
                Number number2 = (Number) trigger.getValue();
                Intrinsics.checkNotNull(number2);
                jDoubleValue = (long) (number2.doubleValue() * ((double) CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT));
                if (evaluateTimeIntervalWithOperator(jDoubleValue, j2, trigger.getOperatorType())) {
                    this.events.fire(new c(triggerId));
                    return true;
                }
                j3 = jDoubleValue - j2;
                if (j3 <= 0) {
                    return false;
                }
                if (this.scheduledMessages.contains(triggerId)) {
                    return false;
                }
                X40.INSTANCE.scheduleTrigger(new d(triggerId), triggerId, j3);
                this.scheduledMessages.add(triggerId);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NotNull
    public final O80<InterfaceC5190lv0> getEvents() {
        return this.events;
    }

    @Override // defpackage.InterfaceC0775Cs0
    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    @Override // defpackage.InterfaceC0775Cs0
    public void subscribe(@NotNull InterfaceC5190lv0 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.events.subscribe(handler);
    }

    @Override // defpackage.InterfaceC0775Cs0
    public void unsubscribe(@NotNull InterfaceC5190lv0 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.events.unsubscribe(handler);
    }
}
