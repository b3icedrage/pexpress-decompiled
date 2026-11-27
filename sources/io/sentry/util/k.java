package io.sentry.util;

import defpackage.BH0;
import defpackage.InterfaceC1560Mu0;
import defpackage.NG1;
import io.sentry.ILogger;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class k {
    public static final Charset a = Charset.forName("UTF-8");

    public static final class a extends Writer {
        public long d = 0;

        public static int c(char c) {
            if (c <= 127) {
                return 1;
            }
            return (c > 2047 && !Character.isSurrogate(c)) ? 3 : 2;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) {
            for (int i3 = i; i3 < i + i2; i3++) {
                this.d += (long) c(cArr[i3]);
            }
        }

        @Override // java.io.Writer
        public final void write(int i) {
            this.d += (long) c((char) i);
        }

        @Override // java.io.Writer
        public final void write(@NotNull String str, int i, int i2) {
            for (int i3 = i; i3 < i + i2; i3++) {
                this.d += (long) c(str.charAt(i3));
            }
        }
    }

    public static long a(@NotNull InterfaceC1560Mu0 interfaceC1560Mu0, @NotNull ILogger iLogger, @Nullable BH0 bh0) {
        try {
            a aVar = new a();
            interfaceC1560Mu0.b(bh0, aVar);
            return aVar.d;
        } catch (Throwable th) {
            iLogger.d(NG1.ERROR, "Could not calculate size of serializable", th);
            return 0L;
        }
    }

    @NotNull
    public static HashMap b(@NotNull Calendar calendar) {
        HashMap map = new HashMap();
        map.put("year", Integer.valueOf(calendar.get(1)));
        map.put("month", Integer.valueOf(calendar.get(2)));
        map.put("dayOfMonth", Integer.valueOf(calendar.get(5)));
        map.put("hourOfDay", Integer.valueOf(calendar.get(11)));
        map.put("minute", Integer.valueOf(calendar.get(12)));
        map.put("second", Integer.valueOf(calendar.get(13)));
        return map;
    }
}
