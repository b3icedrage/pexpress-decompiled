package defpackage;

import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: sT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6564sT {
    public static final TimeZone a = DesugarTimeZone.getTimeZone("GMT");

    @NotNull
    public static final C4944kk0 a(@Nullable Long l) {
        Calendar calendar = Calendar.getInstance(a, Locale.ROOT);
        Intrinsics.checkNotNull(calendar);
        Intrinsics.checkNotNullParameter(calendar, "<this>");
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        int i = calendar.get(16) + calendar.get(15);
        return new C4944kk0(calendar.get(13), calendar.get(12), calendar.get(11), EnumC7461wi2.values()[(calendar.get(7) + 5) % 7], calendar.get(5), calendar.get(6), EnumC3064c11.values()[calendar.get(2)], calendar.get(1), calendar.getTimeInMillis() + ((long) i));
    }
}
