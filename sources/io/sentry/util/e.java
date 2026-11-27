package io.sentry.util;

import com.onesignal.core.activities.PermissionsActivity;
import defpackage.C2688aH1;
import defpackage.EG1;
import defpackage.NG1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e {
    public static boolean a(@NotNull EG1 eg1, @NotNull C2688aH1 c2688aH1) {
        return k.a(c2688aH1.getSerializer(), c2688aH1.getLogger(), eg1) <= C2688aH1.MAX_EVENT_SIZE_BYTES;
    }

    @NotNull
    public static void b(@NotNull EG1 eg1, @NotNull C2688aH1 c2688aH1) {
        ArrayList arrayListC = eg1.c();
        if (arrayListC != null) {
            Iterator it = arrayListC.iterator();
            while (it.hasNext()) {
                io.sentry.protocol.z zVar = ((io.sentry.protocol.s) it.next()).i;
                if (zVar != null) {
                    c(zVar, eg1, c2688aH1, "Truncated exception stack frames of event %s");
                }
            }
        }
        ArrayList arrayListD = eg1.d();
        if (arrayListD != null) {
            Iterator it2 = arrayListD.iterator();
            while (it2.hasNext()) {
                io.sentry.protocol.z zVar2 = ((io.sentry.protocol.A) it2.next()).m;
                if (zVar2 != null) {
                    c(zVar2, eg1, c2688aH1, "Truncated thread stack frames for event %s");
                }
            }
        }
    }

    public static void c(@NotNull io.sentry.protocol.z zVar, @NotNull EG1 eg1, @NotNull C2688aH1 c2688aH1, @NotNull String str) {
        List<io.sentry.protocol.y> list = zVar.d;
        if (list == null || list.size() <= 500) {
            return;
        }
        ArrayList arrayList = new ArrayList(PermissionsActivity.DELAY_TIME_CALLBACK_CALL);
        arrayList.addAll(list.subList(0, 250));
        arrayList.addAll(list.subList(list.size() - 250, list.size()));
        zVar.d = arrayList;
        c2688aH1.getLogger().a(NG1.DEBUG, str, eg1.d);
    }
}
