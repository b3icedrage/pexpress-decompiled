package io.sentry.protocol;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.BH0;
import defpackage.C6319rH0;
import defpackage.C6495s7;
import defpackage.KG0;
import defpackage.LG1;
import defpackage.NG1;
import defpackage.Q71;
import defpackage.W71;
import io.sentry.ILogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements BH0 {

    @NotNull
    public String d;

    @NotNull
    public String e;

    @Nullable
    public CopyOnWriteArraySet g;

    @Nullable
    public CopyOnWriteArraySet h;

    @Nullable
    public HashMap i;

    public static final class a implements KG0<r> {
        @Override // defpackage.KG0
        @NotNull
        public final r a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            q71.X0();
            String strB = null;
            String strB2 = null;
            HashMap map = null;
            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "name":
                        strB = q71.B();
                        break;
                    case "version":
                        strB2 = q71.B();
                        break;
                    case "packages":
                        ArrayList arrayListQ0 = q71.q0(iLogger, new v.a());
                        if (arrayListQ0 == null) {
                            break;
                        } else {
                            arrayList.addAll(arrayListQ0);
                            break;
                        }
                        break;
                    case "integrations":
                        List list = (List) q71.W0();
                        if (list == null) {
                            break;
                        } else {
                            arrayList2.addAll(list);
                            break;
                        }
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        q71.Q(iLogger, map, strX0);
                        break;
                }
            }
            q71.B0();
            if (strB == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"name\"");
                iLogger.d(NG1.ERROR, "Missing required field \"name\"", illegalStateException);
                throw illegalStateException;
            }
            if (strB2 == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"version\"");
                iLogger.d(NG1.ERROR, "Missing required field \"version\"", illegalStateException2);
                throw illegalStateException2;
            }
            r rVar = new r(strB, strB2);
            rVar.g = new CopyOnWriteArraySet(arrayList);
            rVar.h = new CopyOnWriteArraySet(arrayList2);
            rVar.i = map;
            return rVar;
        }
    }

    public r(@NotNull String str, @NotNull String str2) {
        this.d = str;
        this.e = str2;
    }

    @NotNull
    public final String a() {
        return this.d;
    }

    @NotNull
    public final String b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            if (this.d.equals(rVar.d) && this.e.equals(rVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.e});
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        c6319rH0.c(AppMeasurementSdk.ConditionalUserProperty.NAME);
        c6319rH0.j(this.d);
        c6319rH0.c("version");
        c6319rH0.j(this.e);
        CopyOnWriteArraySet copyOnWriteArraySet = this.g;
        if (copyOnWriteArraySet == null) {
            copyOnWriteArraySet = LG1.d().b;
        }
        CopyOnWriteArraySet copyOnWriteArraySet2 = this.h;
        if (copyOnWriteArraySet2 == null) {
            copyOnWriteArraySet2 = LG1.d().a;
        }
        if (!copyOnWriteArraySet.isEmpty()) {
            c6319rH0.c("packages");
            c6319rH0.g(iLogger, copyOnWriteArraySet);
        }
        if (!copyOnWriteArraySet2.isEmpty()) {
            c6319rH0.c("integrations");
            c6319rH0.g(iLogger, copyOnWriteArraySet2);
        }
        HashMap map = this.i;
        if (map != null) {
            for (String str : map.keySet()) {
                C6495s7.e(this.i, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }
}
