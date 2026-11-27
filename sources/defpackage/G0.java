package defpackage;

import G0.a;
import defpackage.G0;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class G0<MessageType extends G0<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements GZ0 {
    protected int memoizedHashCode = 0;

    public static abstract class a<MessageType extends G0<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements JZ0, Cloneable {
    }

    public static void c(List list, List list2) {
        Charset charset = XB0.a;
        list.getClass();
        if (list instanceof InterfaceC3563eP0) {
            List<?> listG = ((InterfaceC3563eP0) list).g();
            InterfaceC3563eP0 interfaceC3563eP0 = (InterfaceC3563eP0) list2;
            int size = list2.size();
            for (Object obj : listG) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC3563eP0.size() - size) + " is null.";
                    for (int size2 = interfaceC3563eP0.size() - 1; size2 >= size; size2--) {
                        interfaceC3563eP0.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC1646Nw) {
                    interfaceC3563eP0.L0((AbstractC1646Nw) obj);
                } else {
                    interfaceC3563eP0.add((String) obj);
                }
            }
            return;
        }
        if (list instanceof InterfaceC5566nh1) {
            list2.addAll(list);
            return;
        }
        if (list2 instanceof ArrayList) {
            ((ArrayList) list2).ensureCapacity(list.size() + list2.size());
        }
        int size3 = list2.size();
        for (Object obj2 : list) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list2.size() - size3) + " is null.";
                for (int size4 = list2.size() - 1; size4 >= size3; size4--) {
                    list2.remove(size4);
                }
                throw new NullPointerException(str2);
            }
            list2.add(obj2);
        }
    }

    @Override // defpackage.GZ0
    public final AbstractC1646Nw.e e() {
        try {
            AbstractC0595Ak0 abstractC0595Ak0 = (AbstractC0595Ak0) this;
            int iA = abstractC0595Ak0.a();
            AbstractC1646Nw.e eVar = AbstractC1646Nw.e;
            byte[] bArr = new byte[iA];
            Logger logger = HE.f;
            HE.a aVar = new HE.a(iA, bArr);
            abstractC0595Ak0.l(aVar);
            if (aVar.I() == 0) {
                return new AbstractC1646Nw.e(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(n("ByteString"), e);
        }
    }

    public int f() {
        throw new UnsupportedOperationException();
    }

    public final String n(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public void o(int i) {
        throw new UnsupportedOperationException();
    }
}
