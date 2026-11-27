package defpackage;

import android.content.Context;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class MI {

    @NotNull
    public final Context a;
    public final int b;
    public final int c;

    @NotNull
    public final String d;

    @NotNull
    public final C4019gb e;

    @NotNull
    public final C6379rb f;
    public final int g;

    @NotNull
    public final EnumC4851kI1 h;

    @NotNull
    public final R02 i;
    public final boolean j;
    public final boolean k;
    public final long l;
    public final long m;

    @NotNull
    public final C5208m0 n;

    @NotNull
    public final C2432Xo o;
    public final boolean p;

    @Nullable
    public Boolean q;

    @Nullable
    public String r;

    @Nullable
    public File s;

    @NotNull
    public LinkedHashSet t;

    public MI() {
        throw null;
    }

    public MI(Context context) {
        C4019gb storageProvider = C0957Fb.d;
        C6379rb loggerProvider = new C6379rb();
        EnumC4851kI1 serverZone = EnumC4851kI1.d;
        R02 trackingOptions = new R02();
        Set autocapture = C5487nJ1.b(EnumC2012So.d);
        C5208m0 identifyInterceptStorageProvider = C0957Fb.g;
        C2432Xo identityStorageProvider = C0957Fb.e;
        Boolean bool = Boolean.FALSE;
        Intrinsics.checkNotNullParameter("f85374691559c6d41e766cab7118bc7c", "apiKey");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("$default_instance", "instanceName");
        Intrinsics.checkNotNullParameter(storageProvider, "storageProvider");
        Intrinsics.checkNotNullParameter(loggerProvider, "loggerProvider");
        Intrinsics.checkNotNullParameter(serverZone, "serverZone");
        Intrinsics.checkNotNullParameter(trackingOptions, "trackingOptions");
        Intrinsics.checkNotNullParameter(autocapture, "autocapture");
        Intrinsics.checkNotNullParameter(identifyInterceptStorageProvider, "identifyInterceptStorageProvider");
        Intrinsics.checkNotNullParameter(identityStorageProvider, "identityStorageProvider");
        C4019gb storageProvider2 = C0957Fb.d;
        EnumC4851kI1 serverZone2 = EnumC4851kI1.d;
        C5208m0 identifyInterceptStorageProvider2 = C0957Fb.g;
        C2432Xo identityStorageProvider2 = C0957Fb.e;
        Intrinsics.checkNotNullParameter("f85374691559c6d41e766cab7118bc7c", "apiKey");
        Intrinsics.checkNotNullParameter("$default_instance", "instanceName");
        Intrinsics.checkNotNullParameter(storageProvider2, "storageProvider");
        Intrinsics.checkNotNullParameter(loggerProvider, "loggerProvider");
        Intrinsics.checkNotNullParameter(serverZone2, "serverZone");
        Intrinsics.checkNotNullParameter(identifyInterceptStorageProvider2, "identifyInterceptStorageProvider");
        Intrinsics.checkNotNullParameter(identityStorageProvider2, "identityStorageProvider");
        this.a = context;
        this.b = 30;
        this.c = 30000;
        this.d = "$default_instance";
        this.e = storageProvider;
        this.f = loggerProvider;
        this.g = 5;
        this.h = serverZone;
        this.i = trackingOptions;
        this.j = true;
        this.k = true;
        this.l = 300000L;
        this.m = 30000L;
        this.n = identifyInterceptStorageProvider;
        this.o = identityStorageProvider;
        this.p = true;
        this.q = bool;
        this.r = null;
        this.t = CollectionsKt.g0(autocapture);
        C3837fi listener = new C3837fi(this, 2);
        Intrinsics.checkNotNullParameter(listener, "listener");
        new C4891kW(0).e.add(listener);
    }

    @NotNull
    public final File a() {
        if (this.s == null) {
            Context context = this.a;
            File dir = context.getDir("amplitude", 0);
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append('/');
            File file = new File(dir, C5807oq.b(sb, this.d, "/analytics/"));
            this.s = file;
            file.mkdirs();
        }
        File file2 = this.s;
        Intrinsics.checkNotNull(file2);
        return file2;
    }
}
