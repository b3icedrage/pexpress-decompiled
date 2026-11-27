package defpackage;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: pb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5960pb extends Handler {

    @NotNull
    public static final C5960pb a = new C5960pb();

    @Override // java.util.logging.Handler
    public final void publish(@NotNull LogRecord record) {
        int i;
        int iMin;
        Intrinsics.checkNotNullParameter(record, "record");
        CopyOnWriteArraySet<Logger> copyOnWriteArraySet = C5750ob.a;
        String loggerName = record.getLoggerName();
        Intrinsics.checkNotNullExpressionValue(loggerName, "record.loggerName");
        int iIntValue = record.getLevel().intValue();
        Level level = Level.INFO;
        if (iIntValue > level.intValue()) {
            i = 5;
        } else {
            i = record.getLevel().intValue() == level.intValue() ? 4 : 3;
        }
        String message = record.getMessage();
        Intrinsics.checkNotNullExpressionValue(message, "record.message");
        Throwable thrown = record.getThrown();
        Intrinsics.checkNotNullParameter(loggerName, "loggerName");
        Intrinsics.checkNotNullParameter(message, "message");
        String strB = C5750ob.b.get(loggerName);
        if (strB == null) {
            strB = KS1.B(23, loggerName);
        }
        if (Log.isLoggable(strB, i)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int iF = StringsKt.F('\n', i2, 4, message);
                if (iF == -1) {
                    iF = length;
                }
                while (true) {
                    iMin = Math.min(iF, i2 + 4000);
                    String strSubstring = message.substring(i2, iMin);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i, strB, strSubstring);
                    if (iMin >= iF) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
