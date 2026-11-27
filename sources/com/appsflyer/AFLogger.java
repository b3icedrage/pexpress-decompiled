package com.appsflyer;

import com.appsflyer.internal.AFc1jSDK;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import defpackage.C1526Mj;
import defpackage.C1952Ru;
import defpackage.C2904bF;
import defpackage.C4987kx1;
import defpackage.C5590nn1;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC4346i70;
import defpackage.PF1;
import defpackage.RunnableC1290Ji;
import defpackage.RunnableC2136Ud0;
import defpackage.RunnableC2214Vd0;
import defpackage.RunnableC2818aq;
import defpackage.RunnableC3237cq;
import defpackage.RunnableC3446dq;
import defpackage.RunnableC4727ji1;
import defpackage.XO0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001.B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\bJ#\u0010\u0010\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0010\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0010\u0010\u0014J!\u0010\u0017\u001a\u00020\u00062\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0015\"\u00020\u0001¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\u00062\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0015\"\u00020\u0001¢\u0006\u0004\b\u0019\u0010\u0018J'\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJG\u0010#\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010$J'\u0010%\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b%\u0010\u001fJ'\u0010&\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b&\u0010\u001fJ'\u0010'\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b'\u0010\u001fJ\u001f\u0010(\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0004H\u0016¢\u0006\u0004\b(\u0010)R\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010*8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b+\u0010,R\u0015\u0010\u001e\u001a\u00020-8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010,"}, d2 = {"Lcom/appsflyer/AFLogger;", "Lcom/appsflyer/sdk_base/logger/AFLoggerBase;", "<init>", "()V", "", "logMessage", "", "afInfoLog", "(Ljava/lang/String;)V", "debugLogMessage", "afDebugLog", "warningLogMessage", "afWarnLog", "errorLogMessage", "", "ex", "afErrorLog", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "", "printThrowable", "(Ljava/lang/String;Ljava/lang/Throwable;Z)V", "", "client", "registerClient", "([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V", "unregisterClient", "Lcom/appsflyer/sdk_base/logger/LogTag;", "tag", "msg", "shouldRemoteDebug", "d", "(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V", "throwable", "printMsg", "shouldReportToExManager", "e", "(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "i", "w", "v", "force", "(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V", "", "AFLogger", "LfO0;", "Ljava/util/concurrent/ExecutorService;", "LogLevel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AFLogger extends AFLoggerBase {

    @NotNull
    public static final AFLogger INSTANCE = new AFLogger();

    /* JADX INFO: renamed from: AFLogger, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC3770fO0 registerClient = XO0.b(new d());

    /* JADX INFO: renamed from: registerClient, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC3770fO0 d = XO0.b(new C5590nn1(1));

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.appsflyer.AFLogger$LogLevel[], still in use, count: 1, list:
      (r0v1 com.appsflyer.AFLogger$LogLevel[]) from 0x0042: INVOKE (r0v1 com.appsflyer.AFLogger$LogLevel[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m), WRAPPED] (LINE:67)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/appsflyer/AFLogger$LogLevel;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "level", "I", "getLevel", "()I", "NONE", "ERROR", "WARNING", "INFO", "DEBUG", "VERBOSE"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);

        private static final /* synthetic */ InterfaceC4346i70 registerClient;
        private final int level;

        static {
            registerClient = C1952Ru.i(logLevelArr);
        }

        private LogLevel(int i) {
            super(str, i);
            this.level = i;
        }

        @NotNull
        public static InterfaceC4346i70<LogLevel> getEntries() {
            return registerClient;
        }

        public static LogLevel valueOf(String str) {
            return (LogLevel) Enum.valueOf(LogLevel.class, str);
        }

        public static LogLevel[] values() {
            return (LogLevel[]) AFKeystoreWrapper.clone();
        }

        public final int getLevel() {
            return this.level;
        }
    }

    private AFLogger() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExecutorService AFKeystoreWrapper() {
        return AFc1jSDK.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AFLogger(LogTag logTag, String str, boolean z, AFLoggerBase aFLoggerBase) {
        Intrinsics.checkNotNullParameter(aFLoggerBase, "");
        aFLoggerBase.w(logTag, str, z);
        return Unit.a;
    }

    public static final void afDebugLog(@NotNull String debugLogMessage) {
        Intrinsics.checkNotNullParameter(debugLogMessage, "");
        INSTANCE.d(LogTag.OTHER, debugLogMessage, true);
    }

    public static final void afErrorLog(@Nullable String errorLogMessage, @Nullable Throwable ex) {
        AFLogger aFLogger = INSTANCE;
        LogTag logTag = LogTag.OTHER;
        if (errorLogMessage == null || StringsKt.I(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFLoggerBase.e$default(aFLogger, logTag, str, ex, false, false, false, false, 120, null);
    }

    public static final void afInfoLog(@NotNull String logMessage) {
        Intrinsics.checkNotNullParameter(logMessage, "");
        INSTANCE.i(LogTag.OTHER, logMessage, true);
    }

    public static final void afWarnLog(@NotNull String warningLogMessage) {
        Intrinsics.checkNotNullParameter(warningLogMessage, "");
        AFLoggerBase.w$default(INSTANCE, LogTag.OTHER, warningLogMessage, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set d() {
        return new LinkedHashSet();
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final void e(@NotNull final LogTag tag, @NotNull final String msg, @NotNull final Throwable throwable, final boolean printMsg, final boolean printThrowable, final boolean shouldReportToExManager, final boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        Intrinsics.checkNotNullParameter(throwable, "");
        ((ExecutorService) d.getValue()).execute(new RunnableC3237cq(new Function1() { // from class: com.appsflyer.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z = printThrowable;
                boolean z2 = shouldReportToExManager;
                return AFLogger.registerClient(tag, msg, throwable, printMsg, z, z2, shouldRemoteDebug, (AFLoggerBase) obj);
            }
        }, 2));
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final void force(@NotNull LogTag tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) d.getValue()).execute(new PF1(new C4987kx1(1, tag, msg), 1));
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final void i(@NotNull final LogTag tag, @NotNull final String msg, final boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) d.getValue()).execute(new RunnableC2818aq(new Function1() { // from class: com.appsflyer.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AFLogger.AFKeystoreWrapper(tag, msg, shouldRemoteDebug, (AFLoggerBase) obj);
            }
        }, 2));
    }

    public final void registerClient(@NotNull AFLoggerBase... client) {
        Intrinsics.checkNotNullParameter(client, "");
        ((ExecutorService) d.getValue()).execute(new RunnableC3446dq(client, 3));
    }

    public final void unregisterClient(@NotNull AFLoggerBase... client) {
        Intrinsics.checkNotNullParameter(client, "");
        ((ExecutorService) d.getValue()).execute(new RunnableC2136Ud0(client, 3));
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final void v(@NotNull final LogTag tag, @NotNull final String msg, final boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) d.getValue()).execute(new RunnableC4727ji1(new Function1() { // from class: com.appsflyer.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AFLogger.d(tag, msg, shouldRemoteDebug, (AFLoggerBase) obj);
            }
        }, 1));
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final void w(@NotNull final LogTag tag, @NotNull final String msg, final boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) d.getValue()).execute(new RunnableC1290Ji(new Function1() { // from class: com.appsflyer.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AFLogger.AFLogger(tag, msg, shouldRemoteDebug, (AFLoggerBase) obj);
            }
        }, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AFKeystoreWrapper(LogTag logTag, String str, boolean z, AFLoggerBase aFLoggerBase) {
        Intrinsics.checkNotNullParameter(aFLoggerBase, "");
        aFLoggerBase.i(logTag, str, z);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFLogger(AFLoggerBase[] aFLoggerBaseArr) {
        ((Set) registerClient.getValue()).removeAll(C1526Mj.H(aFLoggerBaseArr));
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final void d(@NotNull final LogTag tag, @NotNull final String msg, final boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) d.getValue()).execute(new RunnableC2214Vd0(new Function1() { // from class: com.appsflyer.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AFLogger.registerClient(tag, msg, shouldRemoteDebug, (AFLoggerBase) obj);
            }
        }, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFKeystoreWrapper(AFLoggerBase[] aFLoggerBaseArr) {
        C2904bF.p((Set) registerClient.getValue(), aFLoggerBaseArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerClient(LogTag logTag, String str, boolean z, AFLoggerBase aFLoggerBase) {
        Intrinsics.checkNotNullParameter(aFLoggerBase, "");
        aFLoggerBase.d(logTag, str, z);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void unregisterClient(Function1 function1) {
        Iterator it = ((Set) registerClient.getValue()).iterator();
        while (it.hasNext()) {
            function1.invoke((AFLoggerBase) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerClient(LogTag logTag, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4, AFLoggerBase aFLoggerBase) {
        Intrinsics.checkNotNullParameter(aFLoggerBase, "");
        aFLoggerBase.e(logTag, str, th, z, z2, z3, z4);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(LogTag logTag, String str, boolean z, AFLoggerBase aFLoggerBase) {
        Intrinsics.checkNotNullParameter(aFLoggerBase, "");
        aFLoggerBase.v(logTag, str, z);
        return Unit.a;
    }

    public static final void afErrorLog(@Nullable String errorLogMessage, @Nullable Throwable ex, boolean printThrowable) {
        AFLogger aFLogger = INSTANCE;
        LogTag logTag = LogTag.OTHER;
        if (errorLogMessage == null || StringsKt.I(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFLoggerBase.e$default(aFLogger, logTag, str, ex, false, printThrowable, false, false, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerClient(LogTag logTag, String str, AFLoggerBase aFLoggerBase) {
        Intrinsics.checkNotNullParameter(aFLoggerBase, "");
        aFLoggerBase.force(logTag, str);
        return Unit.a;
    }
}
