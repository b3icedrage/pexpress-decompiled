package defpackage;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.sentry.internal.a;
import io.sentry.util.C4527a;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.jar.Attributes;
import java.util.jar.Manifest;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: jW0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4682jW0 implements InterfaceC6033pv0 {

    @NotNull
    public final C2688aH1 a;

    public C4682jW0(@NotNull C2688aH1 c2688aH1) {
        this.a = c2688aH1;
    }

    @Override // defpackage.InterfaceC6033pv0
    public final boolean a() {
        if (a.c == null) {
            C4527a.C0404a c0404aA = a.d.a();
            try {
                if (a.c == null) {
                    a.c = new a();
                }
                c0404aA.close();
            } catch (Throwable th) {
                try {
                    c0404aA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        a aVar = a.c;
        if (!aVar.a) {
            try {
                C4527a.C0404a c0404aA2 = aVar.b.a();
                try {
                    if (!aVar.a) {
                        Enumeration<URL> resources = ClassLoader.getSystemClassLoader().getResources("META-INF/MANIFEST.MF");
                        while (resources.hasMoreElements()) {
                            try {
                                Attributes mainAttributes = new Manifest(FirebasePerfUrlConnection.openStream(resources.nextElement())).getMainAttributes();
                                if (mainAttributes != null) {
                                    String value = mainAttributes.getValue("Sentry-Opentelemetry-SDK-Name");
                                    String value2 = mainAttributes.getValue("Implementation-Version");
                                    String value3 = mainAttributes.getValue("Sentry-SDK-Name");
                                    String value4 = mainAttributes.getValue("Sentry-SDK-Package-Name");
                                    if (value != null && value2 != null) {
                                        String value5 = mainAttributes.getValue("Sentry-Opentelemetry-Version-Name");
                                        if (value5 != null) {
                                            LG1.d().b("maven:io.opentelemetry:opentelemetry-sdk", value5);
                                            LG1.d().a("OpenTelemetry");
                                        }
                                        String value6 = mainAttributes.getValue("Sentry-Opentelemetry-Javaagent-Version-Name");
                                        if (value6 != null) {
                                            LG1.d().b("maven:io.opentelemetry.javaagent:opentelemetry-javaagent", value6);
                                            LG1.d().a("OpenTelemetry-Agent");
                                        }
                                        if (value.equals("sentry.java.opentelemetry.agentless")) {
                                            LG1.d().a("OpenTelemetry-Agentless");
                                        }
                                        if (value.equals("sentry.java.opentelemetry.agentless-spring")) {
                                            LG1.d().a("OpenTelemetry-Agentless-Spring");
                                        }
                                    }
                                    if (value3 != null && value2 != null && value4 != null && value3.startsWith("sentry.java")) {
                                        LG1.d().b(value4, value2);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                    c0404aA2.close();
                } catch (Throwable th3) {
                    try {
                        c0404aA2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (IOException unused2) {
            } catch (Throwable th5) {
                aVar.a = true;
                throw th5;
            }
            aVar.a = true;
        }
        return LG1.d().c(this.a.getFatalLogger());
    }
}
