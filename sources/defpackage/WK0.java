package defpackage;

import io.jsonwebtoken.JwtParser;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class WK0 implements InterfaceC1649Nx {
    public final Object d;

    public WK0(@NotNull List streamAdapterFactories) {
        Intrinsics.checkNotNullParameter(streamAdapterFactories, "streamAdapterFactories");
        this.d = streamAdapterFactories;
    }

    @Override // defpackage.InterfaceC1649Nx
    public void a(@NotNull InterfaceC1101Gx call, @NotNull C0935Et1 c0935Et1) {
        Intrinsics.d(call, "call");
        boolean zG = c0935Et1.a.g();
        C6251qy c6251qy = (C6251qy) this.d;
        if (!zG) {
            C6437rq0 c6437rq0 = new C6437rq0(c0935Et1);
            C1717Ot1.a aVar = C1717Ot1.e;
            c6251qy.resumeWith(C1795Pt1.a(c6437rq0));
            return;
        }
        Object obj = c0935Et1.b;
        if (obj != null) {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            c6251qy.resumeWith(obj);
            return;
        }
        Object objC = call.u().c(YC0.class);
        if (objC == null) {
            Intrinsics.k();
        }
        Intrinsics.b(objC, "call.request().tag(Invocation::class.java)!!");
        StringBuilder sb = new StringBuilder("Response from ");
        Method method = ((YC0) objC).a;
        Class<?> declaringClass = method.getDeclaringClass();
        Intrinsics.b(declaringClass, "method.declaringClass");
        sb.append(declaringClass.getName());
        sb.append(JwtParser.SEPARATOR_CHAR);
        sb.append(method.getName());
        sb.append(" was null but response body type was declared as non-null");
        C3551eL0 c3551eL0 = new C3551eL0(sb.toString());
        C1717Ot1.a aVar3 = C1717Ot1.e;
        c6251qy.resumeWith(C1795Pt1.a(c3551eL0));
    }

    @Override // defpackage.InterfaceC1649Nx
    public void b(@NotNull InterfaceC1101Gx call, @NotNull Throwable th) {
        Intrinsics.d(call, "call");
        C1717Ot1.a aVar = C1717Ot1.e;
        ((C6251qy) this.d).resumeWith(C1795Pt1.a(th));
    }

    public WK0() {
        this.d = new HashSet();
    }

    public WK0(C6251qy c6251qy) {
        this.d = c6251qy;
    }
}
