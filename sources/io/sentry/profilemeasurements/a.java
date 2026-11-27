package io.sentry.profilemeasurements;

import defpackage.BH0;
import defpackage.C4564j;
import defpackage.C6319rH0;
import defpackage.KG0;
import defpackage.Q71;
import defpackage.W71;
import io.sentry.ILogger;
import io.sentry.util.p;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements BH0 {

    @Nullable
    public ConcurrentHashMap d;

    @NotNull
    public String e;

    @NotNull
    public Collection<b> g;

    /* JADX INFO: renamed from: io.sentry.profilemeasurements.a$a, reason: collision with other inner class name */
    public static final class C0398a implements KG0<a> {
        @Override // defpackage.KG0
        @NotNull
        public final a a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            a aVar = new a();
            ConcurrentHashMap concurrentHashMap = null;
            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                if (strX0.equals("values")) {
                    ArrayList arrayListQ0 = q71.q0(iLogger, new b.a());
                    if (arrayListQ0 != null) {
                        aVar.g = arrayListQ0;
                    }
                } else if (strX0.equals("unit")) {
                    String strE0 = q71.e0();
                    if (strE0 != null) {
                        aVar.e = strE0;
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    q71.Q(iLogger, concurrentHashMap, strX0);
                }
            }
            aVar.d = concurrentHashMap;
            q71.B0();
            return aVar;
        }
    }

    public a() {
        this("unknown", new ArrayList());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return p.a(this.d, aVar.d) && this.e.equals(aVar.e) && new ArrayList(this.g).equals(new ArrayList(aVar.g));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.e, this.g});
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        c6319rH0.c("unit");
        c6319rH0.g(iLogger, this.e);
        c6319rH0.c("values");
        c6319rH0.g(iLogger, this.g);
        ConcurrentHashMap concurrentHashMap = this.d;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C4564j.h(this.d, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }

    public a(@NotNull String str, @NotNull AbstractCollection abstractCollection) {
        this.e = str;
        this.g = abstractCollection;
    }
}
