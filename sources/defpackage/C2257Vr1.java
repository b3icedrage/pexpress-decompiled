package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;
import io.sentry.ILogger;
import io.sentry.rrweb.c;
import io.sentry.rrweb.d;
import io.sentry.rrweb.e;
import io.sentry.rrweb.f;
import io.sentry.rrweb.g;
import io.sentry.rrweb.i;
import io.sentry.rrweb.j;
import io.sentry.util.o;
import io.sentry.util.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Vr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2257Vr1 implements BH0 {

    @Nullable
    public Integer d;

    @Nullable
    public List<? extends io.sentry.rrweb.b> e;

    @Nullable
    public HashMap g;

    /* JADX INFO: renamed from: Vr1$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[c.values().length];
            b = iArr;
            try {
                iArr[c.IncrementalSnapshot.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[c.Meta.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[c.Custom.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.a.values().length];
            a = iArr2;
            try {
                iArr2[d.a.MouseInteraction.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[d.a.TouchMove.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: Vr1$b */
    public static final class b implements KG0<C2257Vr1> {
        @Override // defpackage.KG0
        @NotNull
        public final C2257Vr1 a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            C2257Vr1 c2257Vr1 = new C2257Vr1();
            q71.X0();
            ArrayList arrayList = null;
            HashMap map = null;
            Integer numK = null;
            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                if (strX0.equals("segment_id")) {
                    numK = q71.K();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    q71.Q(iLogger, map, strX0);
                }
            }
            q71.B0();
            q71.g0(true);
            List list = (List) q71.W0();
            q71.g0(false);
            if (list != null) {
                arrayList = new ArrayList(list.size());
                for (Object obj : list) {
                    if (obj instanceof Map) {
                        Map map2 = (Map) obj;
                        o oVar = new o(map2);
                        for (Map.Entry entry : map2.entrySet()) {
                            String str = (String) entry.getKey();
                            Object value = entry.getValue();
                            if (str.equals("type")) {
                                c cVar = c.values()[((Integer) value).intValue()];
                                int i = a.b[cVar.ordinal()];
                                if (i == 1) {
                                    Map map3 = (Map) map2.get("data");
                                    if (map3 == null) {
                                        map3 = Collections.EMPTY_MAP;
                                    }
                                    Integer num = (Integer) map3.get(Payload.SOURCE);
                                    if (num != null) {
                                        d.a aVar = d.a.values()[num.intValue()];
                                        int i2 = a.a[aVar.ordinal()];
                                        if (i2 == 1) {
                                            arrayList.add(e.a.b(oVar, iLogger));
                                        } else if (i2 != 2) {
                                            iLogger.a(NG1.DEBUG, "Unsupported rrweb incremental snapshot type %s", aVar);
                                        } else {
                                            arrayList.add(f.a.b(oVar, iLogger));
                                        }
                                    }
                                } else if (i == 2) {
                                    arrayList.add(g.a.b(oVar, iLogger));
                                } else if (i != 3) {
                                    iLogger.a(NG1.DEBUG, "Unsupported rrweb event type %s", cVar);
                                } else {
                                    Map map4 = (Map) map2.get("data");
                                    if (map4 == null) {
                                        map4 = Collections.EMPTY_MAP;
                                    }
                                    String str2 = (String) map4.get("tag");
                                    if (str2 != null) {
                                        switch (str2) {
                                            case "performanceSpan":
                                                arrayList.add(i.a.b(oVar, iLogger));
                                                break;
                                            case "video":
                                                arrayList.add(j.a.b(oVar, iLogger));
                                                break;
                                            case "breadcrumb":
                                                arrayList.add(io.sentry.rrweb.a.C0401a.b(oVar, iLogger));
                                                break;
                                            default:
                                                iLogger.a(NG1.DEBUG, "Unsupported rrweb event type %s", cVar);
                                                break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            c2257Vr1.d = numK;
            c2257Vr1.e = arrayList;
            c2257Vr1.g = map;
            return c2257Vr1;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2257Vr1.class == obj.getClass()) {
            C2257Vr1 c2257Vr1 = (C2257Vr1) obj;
            if (p.a(this.d, c2257Vr1.d) && p.a(this.e, c2257Vr1.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.e});
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) throws IOException {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        if (this.d != null) {
            c6319rH0.c("segment_id");
            c6319rH0.i(this.d);
        }
        HashMap map = this.g;
        if (map != null) {
            for (String str : map.keySet()) {
                C6495s7.e(this.g, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
        io.sentry.vendor.gson.stream.c cVar = c6319rH0.a;
        cVar.j = true;
        if (this.d != null) {
            cVar.q();
            cVar.c();
            cVar.d.append((CharSequence) "\n");
        }
        List<? extends io.sentry.rrweb.b> list = this.e;
        if (list != null) {
            c6319rH0.g(iLogger, list);
        }
        cVar.j = false;
    }
}
