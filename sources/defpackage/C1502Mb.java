package defpackage;

import android.content.SharedPreferences;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Mb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1502Mb implements LQ1, InterfaceC4354i90 {

    @NotNull
    public final DS0 a;

    @NotNull
    public final SharedPreferences b;

    @NotNull
    public final C4144h90 c;

    @NotNull
    public final LinkedHashMap d;

    public C1502Mb(@NotNull String storageKey, @NotNull DS0 logger, @NotNull SharedPreferences sharedPreferences, @NotNull File storageDirectory, @NotNull R00 diagnostics) {
        Intrinsics.checkNotNullParameter(storageKey, "storageKey");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(storageDirectory, "storageDirectory");
        Intrinsics.checkNotNullParameter(diagnostics, "diagnostics");
        this.a = logger;
        this.b = sharedPreferences;
        this.c = new C4144h90(storageDirectory, storageKey, new C5330mb(sharedPreferences), logger, diagnostics);
        this.d = new LinkedHashMap();
    }

    @Override // defpackage.LQ1, defpackage.InterfaceC4354i90
    @NotNull
    public final List<Object> a() {
        final C4144h90 c4144h90 = this.c;
        c4144h90.getClass();
        File[] fileArrListFiles = c4144h90.a.listFiles(new FilenameFilter() { // from class: Y80
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String name) {
                C4144h90 this$0 = c4144h90;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullExpressionValue(name, "name");
                return (!StringsKt.C(name, this$0.b, false) || d.h(name, ".tmp", false) || d.h(name, ".properties", false)) ? false : true;
            }
        });
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        List listB = C1526Mj.B(fileArrListFiles, new C3514e90(c4144h90));
        ArrayList arrayList = new ArrayList(XE.m(listB, 10));
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(((File) it.next()).getAbsolutePath());
        }
        return arrayList;
    }

    @Override // defpackage.LQ1, defpackage.InterfaceC4354i90
    @Nullable
    public final Object b(@NotNull JM jm, @NotNull Object obj) {
        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.String");
        return this.c.e((String) obj, (LM) jm);
    }

    @Override // defpackage.InterfaceC4354i90
    public final boolean c(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        return this.c.g(filePath);
    }

    @Override // defpackage.LQ1, defpackage.InterfaceC4354i90
    @Nullable
    public final Object d(@NotNull LM lm) {
        Object objI = this.c.i(lm);
        return objI == MN.d ? objI : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.LQ1
    @Nullable
    public final Object e(@NotNull C0612Aq event, @NotNull LM lm) {
        C1425Lb c1425Lb;
        C1502Mb c1502Mb;
        String str;
        if (lm instanceof C1425Lb) {
            c1425Lb = (C1425Lb) lm;
            int i = c1425Lb.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1425Lb.i = i - Integer.MIN_VALUE;
            } else {
                c1425Lb = new C1425Lb(this, lm);
            }
        } else {
            c1425Lb = new C1425Lb(this, lm);
        }
        Object obj = c1425Lb.g;
        MN mn = MN.d;
        int i2 = c1425Lb.i;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            Intrinsics.checkNotNullParameter(event, "event");
            String string = C5208m0.j(event).toString();
            Intrinsics.checkNotNullExpressionValue(string, "eventToJsonObject(event).toString()");
            c1425Lb.d = this;
            c1425Lb.e = event;
            c1425Lb.i = 1;
            if (this.c.j(string, c1425Lb) == mn) {
                return mn;
            }
            c1502Mb = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            event = c1425Lb.e;
            c1502Mb = c1425Lb.d;
            C1795Pt1.b(obj);
        }
        InterfaceC1060Gj0<? super C0612Aq, ? super Integer, ? super String, Unit> interfaceC1060Gj0 = event.K;
        if (interfaceC1060Gj0 != null && (str = event.f) != null) {
        }
        return Unit.a;
    }

    @Override // defpackage.LQ1
    @Nullable
    public final String f(@NotNull LQ1.a key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.b.getString(key.d, null);
    }

    @Override // defpackage.LQ1
    @NotNull
    public final InterfaceC1403Kt1 g(@NotNull K80 eventPipeline, @NotNull MI configuration, @NotNull EM scope, @NotNull Y90 dispatcher) {
        Intrinsics.checkNotNullParameter(eventPipeline, "eventPipeline");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return new C2553Zc0(this, eventPipeline, configuration, scope, dispatcher, this.a);
    }

    @Override // defpackage.LQ1
    @Nullable
    public final Unit h(@NotNull LQ1.a aVar, @NotNull String str) {
        this.b.edit().putString(aVar.d, str).apply();
        return Unit.a;
    }

    public final void i(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        C4144h90 c4144h90 = this.c;
        c4144h90.getClass();
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        c4144h90.h.remove(filePath);
    }

    public final void j(@NotNull String insertId) {
        Intrinsics.checkNotNullParameter(insertId, "insertId");
        this.d.remove(insertId);
    }
}
