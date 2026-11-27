package io.sentry.protocol;

import defpackage.BH0;
import defpackage.C2688aH1;
import defpackage.C6319rH0;
import defpackage.C6495s7;
import defpackage.KG0;
import defpackage.Q71;
import defpackage.W71;
import io.sentry.ILogger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.sentry.protocol.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4522d implements BH0 {

    @Nullable
    public q d;

    @Nullable
    public List<DebugImage> e;

    @Nullable
    public HashMap g;

    /* JADX INFO: renamed from: io.sentry.protocol.d$a */
    public static final class a implements KG0<C4522d> {
        @Override // defpackage.KG0
        @NotNull
        public final C4522d a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            C4522d c4522d = new C4522d();
            q71.X0();
            HashMap map = null;
            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                if (strX0.equals("images")) {
                    c4522d.e = q71.q0(iLogger, new DebugImage.a());
                } else if (strX0.equals("sdk_info")) {
                    c4522d.d = (q) q71.H(iLogger, new q.a());
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    q71.Q(iLogger, map, strX0);
                }
            }
            q71.B0();
            c4522d.g = map;
            return c4522d;
        }
    }

    @Nullable
    public static C4522d a(@Nullable C4522d c4522d, @NotNull C2688aH1 c2688aH1) {
        ArrayList arrayList = new ArrayList();
        if (c2688aH1.getProguardUuid() != null) {
            DebugImage debugImage = new DebugImage();
            debugImage.setType(DebugImage.PROGUARD);
            debugImage.setUuid(c2688aH1.getProguardUuid());
            arrayList.add(debugImage);
        }
        for (String str : c2688aH1.getBundleIds()) {
            DebugImage debugImage2 = new DebugImage();
            debugImage2.setType(DebugImage.JVM);
            debugImage2.setDebugId(str);
            arrayList.add(debugImage2);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (c4522d == null) {
            c4522d = new C4522d();
        }
        List<DebugImage> list = c4522d.e;
        if (list == null) {
            c4522d.e = new ArrayList(arrayList);
            return c4522d;
        }
        list.addAll(arrayList);
        return c4522d;
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        if (this.d != null) {
            c6319rH0.c("sdk_info");
            c6319rH0.g(iLogger, this.d);
        }
        if (this.e != null) {
            c6319rH0.c("images");
            c6319rH0.g(iLogger, this.e);
        }
        HashMap map = this.g;
        if (map != null) {
            for (String str : map.keySet()) {
                C6495s7.e(this.g, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }
}
