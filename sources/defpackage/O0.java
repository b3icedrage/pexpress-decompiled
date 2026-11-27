package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class O0 {
    public static boolean a(@NotNull C6075q62 c6075q62, @NotNull InterfaceC6126qM1 type, @NotNull C6075q62.c supertypesPolicy) {
        Intrinsics.checkNotNullParameter(c6075q62, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(supertypesPolicy, "supertypesPolicy");
        InterfaceC4366iD interfaceC4366iD = c6075q62.c;
        if ((interfaceC4366iD.m(type) && !interfaceC4366iD.U(type)) || interfaceC4366iD.z(type)) {
            return true;
        }
        c6075q62.b();
        ArrayDeque<InterfaceC6126qM1> arrayDeque = c6075q62.g;
        Intrinsics.checkNotNull(arrayDeque);
        C3768fN1 c3768fN1 = c6075q62.h;
        Intrinsics.checkNotNull(c3768fN1);
        arrayDeque.push(type);
        while (!arrayDeque.isEmpty()) {
            if (c3768fN1.b() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + type + ". Supertypes = " + CollectionsKt.J(c3768fN1, null, null, null, null, 63)).toString());
            }
            InterfaceC6126qM1 interfaceC6126qM1Pop = arrayDeque.pop();
            Intrinsics.checkNotNull(interfaceC6126qM1Pop);
            if (c3768fN1.add(interfaceC6126qM1Pop)) {
                C6075q62.c cVar = interfaceC4366iD.U(interfaceC6126qM1Pop) ? C6075q62.c.C0474c.a : supertypesPolicy;
                if (Intrinsics.a(cVar, C6075q62.c.C0474c.a)) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    Iterator<InterfaceC5702oL0> it = interfaceC4366iD.t(interfaceC4366iD.J(interfaceC6126qM1Pop)).iterator();
                    while (it.hasNext()) {
                        InterfaceC6126qM1 interfaceC6126qM1A = cVar.a(c6075q62, it.next());
                        if ((interfaceC4366iD.m(interfaceC6126qM1A) && !interfaceC4366iD.U(interfaceC6126qM1A)) || interfaceC4366iD.z(interfaceC6126qM1A)) {
                            c6075q62.a();
                            return true;
                        }
                        arrayDeque.add(interfaceC6126qM1A);
                    }
                }
            }
        }
        c6075q62.a();
        return false;
    }

    public static boolean b(C6075q62 c6075q62, InterfaceC6126qM1 interfaceC6126qM1, InterfaceC6704t62 interfaceC6704t62) {
        InterfaceC4366iD interfaceC4366iD = c6075q62.c;
        if (interfaceC4366iD.M(interfaceC6126qM1)) {
            return true;
        }
        if (interfaceC4366iD.U(interfaceC6126qM1)) {
            return false;
        }
        if (c6075q62.b && interfaceC4366iD.A(interfaceC6126qM1)) {
            return true;
        }
        return interfaceC4366iD.R(interfaceC4366iD.J(interfaceC6126qM1), interfaceC6704t62);
    }
}
