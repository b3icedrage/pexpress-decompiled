package defpackage;

import com.jivosite.sdk.lifecycle.JivoLifecycleObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qF0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6104qF0 {
    public static C4201hS a;

    @Nullable
    public static C4201hS.b b;

    @Nullable
    public static C4201hS.a c;

    @NotNull
    public static final ArrayList<WeakReference<InterfaceC7325w41>> d = new ArrayList<>();

    @NotNull
    public static final ArrayList<WeakReference<O61>> e = new ArrayList<>();
    public static JivoLifecycleObserver f;
    public static C6102qE1 g;
    public static EK1 h;

    @NotNull
    public static C3332dI i;

    static {
        C3332dI.a aVar = new C3332dI.a();
        i = new C3332dI(aVar.a, aVar.b, aVar.c, aVar.d);
    }

    public static void a(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
    }

    public static void b(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
    }

    public static void c(@NotNull String msg, @NotNull Throwable e2) {
        Intrinsics.checkNotNullParameter(e2, "e");
        Intrinsics.checkNotNullParameter(msg, "msg");
    }

    @NotNull
    public static WF0 d() {
        C4201hS c4201hS = a;
        if (c4201hS != null) {
            return c4201hS;
        }
        Intrinsics.l("jivoSdkComponent");
        throw null;
    }

    public static void e(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
    }

    public static void f(boolean z) {
        ArrayList<WeakReference<InterfaceC7325w41>> arrayList = d;
        ArrayList arrayList2 = new ArrayList();
        for (WeakReference<InterfaceC7325w41> weakReference : arrayList) {
            if (weakReference.get() != null) {
                arrayList2.add(weakReference);
            }
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        Iterator<WeakReference<InterfaceC7325w41>> it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC7325w41 interfaceC7325w41 = it.next().get();
            if (interfaceC7325w41 != null) {
                interfaceC7325w41.c(z);
            }
        }
    }

    public static final void g(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        if (a != null) {
            EK1 ek1 = h;
            if (ek1 == null) {
                Intrinsics.l("storage");
                throw null;
            }
            if (Intrinsics.a((String) ek1.l.a(EK1.z[12], ek1), token)) {
                return;
            }
            EK1 ek2 = h;
            if (ek2 == null) {
                Intrinsics.l("storage");
                throw null;
            }
            ek2.h(token);
            EK1 ek3 = h;
            if (ek3 == null) {
                Intrinsics.l("storage");
                throw null;
            }
            ek3.g(false);
            ((W92) ((C4201hS) d()).l.get()).a();
        }
    }

    public static void h(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
    }
}
