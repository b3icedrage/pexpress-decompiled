package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.util.Log;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.sentry.android.core.b0;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ#\u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0011\u0010\u000fJ#\u0010\u0012\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0012\u0010\u000fJ#\u0010\u0013\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\u000fJ#\u0010\u0014\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0014\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0015\u0010\u0017J)\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0017J)\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u0017J)\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u0017J\u0015\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010\u001eR\u0014\u0010 \u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010!R$\u0010#\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001b0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R(\u0010,\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b,\u0010-\u0012\u0004\b2\u0010\u0003\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R(\u00103\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b3\u0010-\u0012\u0004\b6\u0010\u0003\u001a\u0004\b4\u0010/\"\u0004\b5\u00101¨\u00067"}, d2 = {"LNS0;", "", "<init>", "()V", "LnS0;", "level", "", "atLogLevel", "(LnS0;)Z", "", "message", "", "throwable", "", "verbose", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "debug", "info", "warn", "error", "fatal", "log", "(LnS0;Ljava/lang/String;)V", "(LnS0;Ljava/lang/String;Ljava/lang/Throwable;)V", "logToLogcat", "showVisualLogging", "callLogListeners", "Lot0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "(Lot0;)V", "removeListener", "TAG", "Ljava/lang/String;", "LWr0;", "applicationService", "LWr0;", "getApplicationService", "()LWr0;", "setApplicationService", "(LWr0;)V", "Ljava/util/concurrent/CopyOnWriteArraySet;", "logListeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "logLevel", "LnS0;", "getLogLevel", "()LnS0;", "setLogLevel", "(LnS0;)V", "getLogLevel$annotations", "visualLogLevel", "getVisualLogLevel", "setVisualLogLevel", "getVisualLogLevel$annotations", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class NS0 {

    @NotNull
    private static final String TAG = "OneSignal";

    @Nullable
    private static InterfaceC2338Wr0 applicationService;

    @NotNull
    public static final NS0 INSTANCE = new NS0();

    @NotNull
    private static final CopyOnWriteArraySet<InterfaceC5817ot0> logListeners = new CopyOnWriteArraySet<>();

    @NotNull
    private static EnumC5513nS0 logLevel = EnumC5513nS0.WARN;

    @NotNull
    private static EnumC5513nS0 visualLogLevel = EnumC5513nS0.NONE;

    @InterfaceC3368dU(c = "com.onesignal.debug.internal.logging.Logging$showVisualLogging$1", f = "Logging.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a extends AW1 implements Function1<JM<? super Unit>, Object> {
        final /* synthetic */ String $finalFullMessage;
        final /* synthetic */ EnumC5513nS0 $level;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EnumC5513nS0 enumC5513nS0, String str, JM<? super a> jm) {
            super(1, jm);
            this.$level = enumC5513nS0;
            this.$finalFullMessage = str;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return new a(this.$level, this.$finalFullMessage, jm);
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
            InterfaceC2338Wr0 applicationService = NS0.INSTANCE.getApplicationService();
            Activity activity = applicationService != null ? applicationService.get_current() : null;
            if (activity != null) {
                new AlertDialog.Builder(activity).setTitle(this.$level.toString()).setMessage(this.$finalFullMessage).show();
            }
            return Unit.a;
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC5513nS0.values().length];
            iArr[EnumC5513nS0.VERBOSE.ordinal()] = 1;
            iArr[EnumC5513nS0.DEBUG.ordinal()] = 2;
            iArr[EnumC5513nS0.INFO.ordinal()] = 3;
            iArr[EnumC5513nS0.WARN.ordinal()] = 4;
            iArr[EnumC5513nS0.ERROR.ordinal()] = 5;
            iArr[EnumC5513nS0.FATAL.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private NS0() {
    }

    public static final boolean atLogLevel(@NotNull EnumC5513nS0 level) {
        Intrinsics.checkNotNullParameter(level, "level");
        return level.compareTo(visualLogLevel) < 1 || level.compareTo(logLevel) < 1;
    }

    private final void callLogListeners(EnumC5513nS0 level, String message, Throwable throwable) {
        CopyOnWriteArraySet<InterfaceC5817ot0> copyOnWriteArraySet = logListeners;
        if (copyOnWriteArraySet.isEmpty()) {
            return;
        }
        if (throwable != null) {
            message = message + '\n' + Log.getStackTraceString(throwable);
        }
        Iterator<InterfaceC5817ot0> it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            it.next().onLogEvent(new G91(level, message));
        }
    }

    public static final void debug(@NotNull String message, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(message, "message");
        log(EnumC5513nS0.DEBUG, message, throwable);
    }

    public static /* synthetic */ void debug$default(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        debug(str, th);
    }

    public static final void error(@NotNull String message, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(message, "message");
        log(EnumC5513nS0.ERROR, message, throwable);
    }

    public static /* synthetic */ void error$default(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        error(str, th);
    }

    public static final void fatal(@NotNull String message, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(message, "message");
        log(EnumC5513nS0.FATAL, message, throwable);
    }

    public static /* synthetic */ void fatal$default(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        fatal(str, th);
    }

    @NotNull
    public static final EnumC5513nS0 getLogLevel() {
        return logLevel;
    }

    @NotNull
    public static final EnumC5513nS0 getVisualLogLevel() {
        return visualLogLevel;
    }

    public static final void info(@NotNull String message, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(message, "message");
        log(EnumC5513nS0.INFO, message, throwable);
    }

    public static /* synthetic */ void info$default(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        info(str, th);
    }

    public static final void log(@NotNull EnumC5513nS0 level, @NotNull String message) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        log(level, message, null);
    }

    private final void logToLogcat(EnumC5513nS0 level, String message, Throwable throwable) {
        if (level.compareTo(logLevel) >= 1) {
            return;
        }
        int i = b.$EnumSwitchMapping$0[level.ordinal()];
        if (i == 4) {
            b0.f(TAG, message, throwable);
        } else if (i == 5 || i == 6) {
            b0.d(TAG, message, throwable);
        }
    }

    public static final void setLogLevel(@NotNull EnumC5513nS0 enumC5513nS0) {
        Intrinsics.checkNotNullParameter(enumC5513nS0, "<set-?>");
        logLevel = enumC5513nS0;
    }

    public static final void setVisualLogLevel(@NotNull EnumC5513nS0 enumC5513nS0) {
        Intrinsics.checkNotNullParameter(enumC5513nS0, "<set-?>");
        visualLogLevel = enumC5513nS0;
    }

    private final void showVisualLogging(EnumC5513nS0 level, String message, Throwable throwable) {
        if (level.compareTo(visualLogLevel) >= 1) {
            return;
        }
        try {
            String strB = DS1.b(message + '\n');
            if (throwable != null) {
                String str = strB + throwable.getMessage();
                StringWriter stringWriter = new StringWriter();
                throwable.printStackTrace(new PrintWriter(stringWriter));
                strB = str + stringWriter;
            }
            LY1.suspendifyOnMain(new a(level, strB, null));
        } catch (Throwable th) {
            b0.d(TAG, "Error showing logging message.", th);
        }
    }

    public static final void verbose(@NotNull String message, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(message, "message");
        log(EnumC5513nS0.VERBOSE, message, throwable);
    }

    public static /* synthetic */ void verbose$default(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        verbose(str, th);
    }

    public static final void warn(@NotNull String message, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(message, "message");
        log(EnumC5513nS0.WARN, message, throwable);
    }

    public static /* synthetic */ void warn$default(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        warn(str, th);
    }

    public final void addListener(@NotNull InterfaceC5817ot0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        logListeners.add(listener);
    }

    @Nullable
    public final InterfaceC2338Wr0 getApplicationService() {
        return applicationService;
    }

    public final void removeListener(@NotNull InterfaceC5817ot0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        logListeners.remove(listener);
    }

    public final void setApplicationService(@Nullable InterfaceC2338Wr0 interfaceC2338Wr0) {
        applicationService = interfaceC2338Wr0;
    }

    public static final void log(@NotNull EnumC5513nS0 level, @NotNull String message, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        String str = "[" + Thread.currentThread().getName() + "] " + message;
        NS0 ns0 = INSTANCE;
        ns0.logToLogcat(level, str, throwable);
        ns0.showVisualLogging(level, str, throwable);
        ns0.callLogListeners(level, str, throwable);
    }

    public static /* synthetic */ void getLogLevel$annotations() {
    }

    public static /* synthetic */ void getVisualLogLevel$annotations() {
    }
}
