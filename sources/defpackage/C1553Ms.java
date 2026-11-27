package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ms, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1553Ms {

    @NotNull
    public final LinkedHashMap<String, a> a;

    /* JADX INFO: renamed from: Ms$a */
    public static final class a {

        @Nullable
        public final String a;

        @Nullable
        public final String b;

        @NotNull
        public final String c;
        public final long d;

        public a(@NotNull String blobUrl, @Nullable String str, @Nullable String str2, @NotNull String origin, long j) {
            Intrinsics.checkNotNullParameter(blobUrl, "blobUrl");
            Intrinsics.checkNotNullParameter(origin, "origin");
            this.a = str;
            this.b = str2;
            this.c = origin;
            this.d = j;
        }
    }

    public C1553Ms() {
        Hh2.b clock = Hh2.b.m;
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.a = new LinkedHashMap<>();
    }
}
