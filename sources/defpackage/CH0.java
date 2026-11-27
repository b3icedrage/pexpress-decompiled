package defpackage;

import io.sentry.ILogger;
import io.sentry.profilemeasurements.a;
import io.sentry.profilemeasurements.b;
import io.sentry.protocol.A;
import io.sentry.protocol.B;
import io.sentry.protocol.C4519a;
import io.sentry.protocol.C4520b;
import io.sentry.protocol.C4521c;
import io.sentry.protocol.C4522d;
import io.sentry.protocol.C4523e;
import io.sentry.protocol.C4526h;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.F;
import io.sentry.protocol.G;
import io.sentry.protocol.H;
import io.sentry.protocol.j;
import io.sentry.protocol.k;
import io.sentry.protocol.l;
import io.sentry.protocol.m;
import io.sentry.protocol.n;
import io.sentry.protocol.o;
import io.sentry.protocol.q;
import io.sentry.protocol.r;
import io.sentry.protocol.s;
import io.sentry.protocol.v;
import io.sentry.protocol.w;
import io.sentry.protocol.x;
import io.sentry.protocol.y;
import io.sentry.protocol.z;
import io.sentry.rrweb.c;
import io.sentry.rrweb.e;
import io.sentry.rrweb.f;
import io.sentry.rrweb.g;
import io.sentry.rrweb.i;
import io.sentry.util.p;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class CH0 implements InterfaceC1560Mu0 {
    public static final Charset c = Charset.forName("UTF-8");

    @NotNull
    public final C2688aH1 a;

    @NotNull
    public final HashMap b;

    public CH0(@NotNull C2688aH1 c2688aH1) {
        this.a = c2688aH1;
        HashMap map = new HashMap();
        this.b = map;
        map.put(C4519a.class, new C4519a.C0399a());
        map.put(C0702Bu.class, new C0702Bu.a());
        map.put(C4520b.class, new C4520b.a());
        map.put(C4521c.class, new C4521c.a());
        map.put(DebugImage.class, new DebugImage.a());
        map.put(C4522d.class, new C4522d.a());
        map.put(C4523e.class, new C4523e.a());
        map.put(C4523e.b.class, new C4523e.b.a());
        map.put(C4526h.class, new C4526h.a());
        map.put(j.class, new j.a());
        map.put(z.b.class, new z.b.a());
        map.put(k.class, new k.a());
        map.put(l.class, new l.a());
        map.put(m.class, new m.a());
        map.put(n.class, new n.a());
        map.put(C1445Lh1.class, new C1445Lh1.b());
        map.put(C1522Mh1.class, new C1522Mh1.a());
        map.put(C1136Hi1.class, new C1136Hi1.a());
        map.put(C1214Ii1.class, new C1214Ii1.a());
        map.put(a.class, new a.C0398a());
        map.put(b.class, new b.a());
        map.put(o.class, new o.a());
        map.put(C2257Vr1.class, new C2257Vr1.b());
        map.put(io.sentry.rrweb.a.class, new io.sentry.rrweb.a.C0401a());
        map.put(c.class, new c.a());
        map.put(e.class, new e.a());
        map.put(f.class, new f.a());
        map.put(g.class, new g.a());
        map.put(i.class, new i.a());
        map.put(io.sentry.rrweb.j.class, new io.sentry.rrweb.j.a());
        map.put(q.class, new q.a());
        map.put(r.class, new r.a());
        map.put(C3747fG1.class, new C3747fG1.a());
        map.put(DG1.class, new DG1.a());
        map.put(EG1.class, new EG1.a());
        map.put(s.class, new s.a());
        map.put(MG1.class, new MG1.a());
        map.put(NG1.class, new NG1.a());
        map.put(OG1.class, new OG1.a());
        map.put(RG1.class, new RG1.a());
        map.put(VG1.class, new VG1.a());
        map.put(v.class, new v.a());
        map.put(w.class, new w.a());
        map.put(C2912bH1.class, new C2912bH1.a());
        map.put(x.class, new x.a());
        map.put(y.class, new y.a());
        map.put(z.class, new z.a());
        map.put(RF1.class, new RF1.a());
        map.put(A.class, new A.a());
        map.put(B.class, new B.a());
        map.put(CI1.class, new CI1.a());
        map.put(C3561eO1.class, new C3561eO1.a());
        map.put(C4401iO1.class, new C4401iO1.a());
        map.put(EnumC4869kO1.class, new EnumC4869kO1.a());
        map.put(F.class, new F.a());
        map.put(io.sentry.protocol.i.class, new io.sentry.protocol.i.a());
        map.put(C5120lb2.class, new C5120lb2.a());
        map.put(io.sentry.clientreport.b.class, new io.sentry.clientreport.b.a());
        map.put(H.class, new H.a());
        map.put(G.class, new G.a());
    }

    @Override // defpackage.InterfaceC1560Mu0
    public final void a(@NotNull C3537eG1 c3537eG1, @NotNull OutputStream outputStream) throws IOException {
        C2688aH1 c2688aH1 = this.a;
        p.b(c3537eG1, "The SentryEnvelope object is required.");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), c));
        try {
            c3537eG1.a.serialize(new C6319rH0(bufferedWriter, c2688aH1.getMaxDepth()), c2688aH1.getLogger());
            bufferedWriter.write("\n");
            for (CG1 cg1 : c3537eG1.b) {
                try {
                    byte[] bArrF = cg1.f();
                    cg1.a.serialize(new C6319rH0(bufferedWriter, c2688aH1.getMaxDepth()), c2688aH1.getLogger());
                    bufferedWriter.write("\n");
                    bufferedWriter.flush();
                    outputStream.write(bArrF);
                    bufferedWriter.write("\n");
                } catch (Exception e) {
                    c2688aH1.getLogger().d(NG1.ERROR, "Failed to create envelope item. Dropping it.", e);
                }
            }
            bufferedWriter.flush();
        } catch (Throwable th) {
            bufferedWriter.flush();
            throw th;
        }
    }

    @Override // defpackage.InterfaceC1560Mu0
    public final <T> void b(@NotNull T t, @NotNull Writer writer) throws IOException {
        p.b(t, "The entity is required.");
        C2688aH1 c2688aH1 = this.a;
        ILogger logger = c2688aH1.getLogger();
        NG1 ng1 = NG1.DEBUG;
        if (logger.b(ng1)) {
            c2688aH1.getLogger().a(ng1, "Serializing object: %s", f(c2688aH1.isEnablePrettySerializationOutput(), t));
        }
        C6319rH0 c6319rH0 = new C6319rH0(writer, c2688aH1.getMaxDepth());
        c6319rH0.b.a(c6319rH0, c2688aH1.getLogger(), t);
        writer.flush();
    }

    @Override // defpackage.InterfaceC1560Mu0
    @NotNull
    public final String c(@NotNull ConcurrentHashMap concurrentHashMap) {
        return f(false, concurrentHashMap);
    }

    @Override // defpackage.InterfaceC1560Mu0
    @Nullable
    public final <T> T d(@NotNull Reader reader, @NotNull Class<T> cls) {
        T tCast;
        C2688aH1 c2688aH1 = this.a;
        try {
            C5900pH0 c5900pH0 = new C5900pH0(reader);
            try {
                KG0 kg0 = (KG0) this.b.get(cls);
                if (kg0 != null) {
                    tCast = cls.cast(kg0.a(c5900pH0, c2688aH1.getLogger()));
                } else {
                    if (!cls.isArray() && !Collection.class.isAssignableFrom(cls) && !String.class.isAssignableFrom(cls) && !Map.class.isAssignableFrom(cls)) {
                        c5900pH0.close();
                        return null;
                    }
                    tCast = (T) c5900pH0.W0();
                }
                c5900pH0.close();
                return tCast;
            } catch (Throwable th) {
                try {
                    c5900pH0.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e) {
            c2688aH1.getLogger().d(NG1.ERROR, "Error when deserializing", e);
            return null;
        }
    }

    @Override // defpackage.InterfaceC1560Mu0
    @Nullable
    public final C3537eG1 e(@NotNull BufferedInputStream bufferedInputStream) {
        C2688aH1 c2688aH1 = this.a;
        try {
            return c2688aH1.getEnvelopeReader().a(bufferedInputStream);
        } catch (IOException e) {
            c2688aH1.getLogger().d(NG1.ERROR, "Error deserializing envelope.", e);
            return null;
        }
    }

    @NotNull
    public final String f(boolean z, Object obj) throws IOException {
        StringWriter stringWriter = new StringWriter();
        C2688aH1 c2688aH1 = this.a;
        C6319rH0 c6319rH0 = new C6319rH0(stringWriter, c2688aH1.getMaxDepth());
        if (z) {
            c6319rH0.d("\t");
        }
        c6319rH0.b.a(c6319rH0, c2688aH1.getLogger(), obj);
        return stringWriter.toString();
    }
}
