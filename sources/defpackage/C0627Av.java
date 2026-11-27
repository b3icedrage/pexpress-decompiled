package defpackage;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Av, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0627Av extends ZZ implements InterfaceC8132zv {

    /* JADX INFO: renamed from: Av$a */
    public static final class a {
        /* JADX WARN: Code duplicated, block: B:15:0x0040  */
        @NotNull
        public static C0627Av a(@NotNull C1758Ph0 fqName, @NotNull C2720aS0 storageManager, @NotNull S01 module, @NotNull InputStream inputStream) throws IOException {
            boolean z;
            C3428dk1 c3428dk1;
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(inputStream, "inputStream");
            Intrinsics.checkNotNullParameter(inputStream, "<this>");
            try {
                C7081uv c7081uv = C7081uv.f;
                C7081uv c7081uvA = C7081uv.a.a(inputStream);
                C7081uv ourVersion = C7081uv.f;
                Intrinsics.checkNotNullParameter(ourVersion, "ourVersion");
                int i = c7081uvA.c;
                int i2 = c7081uvA.b;
                if (i2 == 0) {
                    if (ourVersion.b == 0 && i == ourVersion.c) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (i2 != ourVersion.b || i > ourVersion.c) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    C1578Na0 c1578Na0 = new C1578Na0();
                    C0705Bv.a(c1578Na0);
                    C3428dk1.a aVar = C3428dk1.o;
                    aVar.getClass();
                    EE ee = new EE(inputStream);
                    HZ0 hz0 = (HZ0) aVar.a(ee, c1578Na0);
                    try {
                        ee.a(0);
                        Q0.b(hz0);
                        c3428dk1 = (C3428dk1) hz0;
                    } catch (C7144vC0 e) {
                        e.d = hz0;
                        throw e;
                    }
                } else {
                    c3428dk1 = null;
                }
                C3428dk1 c3428dk2 = c3428dk1;
                inputStream.close();
                if (c3428dk2 != null) {
                    return new C0627Av(fqName, storageManager, module, c3428dk2, c7081uvA);
                }
                throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + ourVersion + ", actual " + c7081uvA + ". Please update Kotlin");
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    C6621sj.b(inputStream, th);
                    throw th2;
                }
            }
        }
    }

    @Override // defpackage.AbstractC2470Ya1, defpackage.AbstractC4885kU
    @NotNull
    public final String toString() {
        return "builtins package fragment for " + this.i + " from " + C4900kZ.j(this);
    }
}
