package defpackage;

import java.util.HashMap;
import org.codehaus.janino.ClassBodyEvaluator;

/* JADX INFO: renamed from: Dj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0827Dj1 extends C5494nM {
    public final C3315dC0 h;

    public C0827Dj1(C3315dC0 c3315dC0) {
        new HashMap();
        this.h = c3315dC0;
    }

    public final ZH q(String str) {
        ClassBodyEvaluator classBodyEvaluator = new ClassBodyEvaluator();
        classBodyEvaluator.setImplementedInterfaces(new Class[]{ZH.class});
        classBodyEvaluator.setExtendedClass(C1843Qj1.class);
        classBodyEvaluator.setParentClassLoader(ClassBodyEvaluator.class.getClassLoader());
        classBodyEvaluator.cook(C1039Gc0.d("public boolean evaluate() { return ", str, "; }"));
        Class clazz = classBodyEvaluator.getClazz();
        ZH zh = (ZH) clazz.newInstance();
        clazz.getMethod("setPropertyContainers", InterfaceC7884yj1.class, InterfaceC7884yj1.class).invoke(zh, this.h, this.e);
        return zh;
    }
}
