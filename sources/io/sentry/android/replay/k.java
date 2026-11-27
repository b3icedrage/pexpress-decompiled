package io.sentry.android.replay;

import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.C0648Bc;
import defpackage.C1589Ne;
import defpackage.C2688aH1;
import defpackage.C2904bF;
import defpackage.C3027bp1;
import defpackage.C5759od0;
import defpackage.C6621sj;
import defpackage.KW1;
import defpackage.ML0;
import defpackage.NG1;
import defpackage.XO0;
import io.sentry.util.C4527a;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class k implements Closeable {

    @NotNull
    public final C2688aH1 d;

    @NotNull
    public final io.sentry.protocol.u e;

    @NotNull
    public final AtomicBoolean g;

    @NotNull
    public final C4527a h;

    @NotNull
    public final C4527a i;

    @NotNull
    public final C4527a j;

    @Nullable
    public io.sentry.android.replay.video.e k;

    @NotNull
    public final KW1 l;

    @NotNull
    public final ArrayList m;

    @NotNull
    public final LinkedHashMap<String, String> n;

    @NotNull
    public final KW1 o;

    public static final class a extends ML0 implements Function0<File> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() throws IOException {
            k kVar = k.this;
            if (kVar.g() == null) {
                return null;
            }
            File file = new File(kVar.g(), ".ongoing_segment");
            if (!file.exists()) {
                file.createNewFile();
            }
            return file;
        }
    }

    public static final class b extends ML0 implements Function1<Map.Entry<String, String>, CharSequence> {
        public static final b d = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(Map.Entry<String, String> entry) {
            Map.Entry<String, String> entry2 = entry;
            Intrinsics.checkNotNullParameter(entry2, "<name for destructuring parameter 0>");
            return entry2.getKey() + '=' + entry2.getValue();
        }
    }

    public static final class c extends ML0 implements Function0<File> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            k kVar = k.this;
            C2688aH1 options = kVar.d;
            Intrinsics.checkNotNullParameter(options, "options");
            io.sentry.protocol.u replayId = kVar.e;
            Intrinsics.checkNotNullParameter(replayId, "replayId");
            String cacheDirPath = options.getCacheDirPath();
            if (cacheDirPath == null || cacheDirPath.length() == 0) {
                options.getLogger().a(NG1.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
                return null;
            }
            String cacheDirPath2 = options.getCacheDirPath();
            Intrinsics.checkNotNull(cacheDirPath2);
            File file = new File(cacheDirPath2, "replay_" + replayId);
            file.mkdirs();
            return file;
        }
    }

    public static final class d extends ML0 implements Function1<l, Boolean> {
        public final /* synthetic */ long d;
        public final /* synthetic */ k e;
        public final /* synthetic */ C3027bp1<String> g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j, k kVar, C3027bp1<String> c3027bp1) {
            super(1);
            this.d = j;
            this.e = kVar;
            this.g = c3027bp1;
        }

        /* JADX WARN: Type inference failed for: r5v3, types: [T, java.lang.String] */
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(l lVar) {
            l it = lVar;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.b < this.d) {
                this.e.f(it.a);
                return Boolean.TRUE;
            }
            C3027bp1<String> c3027bp1 = this.g;
            if (c3027bp1.d == null) {
                c3027bp1.d = it.c;
            }
            return Boolean.FALSE;
        }
    }

    public k(@NotNull C2688aH1 options, @NotNull io.sentry.protocol.u replayId) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        this.d = options;
        this.e = replayId;
        this.g = new AtomicBoolean(false);
        this.h = new C4527a();
        this.i = new C4527a();
        this.j = new C4527a();
        this.l = XO0.b(new c());
        this.m = new ArrayList();
        this.n = new LinkedHashMap<>();
        this.o = XO0.b(new a());
    }

    public final void c(@NotNull File screenshot, long j, @Nullable String str) {
        Intrinsics.checkNotNullParameter(screenshot, "screenshot");
        l lVar = new l(screenshot, j, str);
        C4527a.C0404a c0404aA = this.j.a();
        try {
            this.m.add(lVar);
            Unit unit = Unit.a;
            c0404aA.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C1589Ne.l(c0404aA, th);
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C4527a.C0404a c0404aA = this.h.a();
        try {
            io.sentry.android.replay.video.e eVar = this.k;
            if (eVar != null) {
                eVar.c();
            }
            this.k = null;
            Unit unit = Unit.a;
            c0404aA.close();
            this.g.set(true);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C1589Ne.l(c0404aA, th);
                throw th2;
            }
        }
    }

    public final void f(File file) {
        C2688aH1 c2688aH1 = this.d;
        try {
            if (file.delete()) {
                return;
            }
            c2688aH1.getLogger().a(NG1.ERROR, "Failed to delete replay frame: %s", file.getAbsolutePath());
        } catch (Throwable th) {
            c2688aH1.getLogger().c(NG1.ERROR, th, "Failed to delete replay frame: %s", file.getAbsolutePath());
        }
    }

    @Nullable
    public final File g() {
        return (File) this.l.getValue();
    }

    public final void k(@NotNull String key, @Nullable String str) {
        File file;
        File file2;
        KW1 kw1 = this.o;
        Intrinsics.checkNotNullParameter(key, "key");
        C4527a.C0404a c0404aA = this.i.a();
        try {
            if (this.g.get()) {
                c0404aA.close();
                return;
            }
            File file3 = (File) kw1.getValue();
            if ((file3 == null || !file3.exists()) && (file = (File) kw1.getValue()) != null) {
                file.createNewFile();
            }
            LinkedHashMap<String, String> linkedHashMap = this.n;
            if (linkedHashMap.isEmpty() && (file2 = (File) kw1.getValue()) != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2), Charsets.UTF_8), 8192);
                try {
                    Iterator it = C0648Bc.h(bufferedReader).iterator();
                    while (it.hasNext()) {
                        List listSplit$default = StringsKt__StringsKt.split$default((String) it.next(), new String[]{"="}, false, 2, 2, null);
                        linkedHashMap.put((String) listSplit$default.get(0), (String) listSplit$default.get(1));
                    }
                    bufferedReader.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        C6621sj.b(bufferedReader, th);
                        throw th2;
                    }
                }
            }
            if (str == null) {
                linkedHashMap.remove(key);
            } else {
                linkedHashMap.put(key, str);
            }
            File file4 = (File) kw1.getValue();
            if (file4 != null) {
                Set<Map.Entry<String, String>> setEntrySet = linkedHashMap.entrySet();
                Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
                C5759od0.b(file4, CollectionsKt.J(setEntrySet, "\n", null, null, b.d, 30));
                Unit unit = Unit.a;
            }
            c0404aA.close();
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                C1589Ne.l(c0404aA, th3);
                throw th4;
            }
        }
    }

    @Nullable
    public final String l(long j) {
        C3027bp1 c3027bp1 = new C3027bp1();
        C4527a.C0404a c0404aA = this.j.a();
        try {
            C2904bF.r(this.m, new d(j, this, c3027bp1));
            c0404aA.close();
            return (String) c3027bp1.d;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C1589Ne.l(c0404aA, th);
                throw th2;
            }
        }
    }
}
