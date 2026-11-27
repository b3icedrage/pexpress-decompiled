package defpackage;

import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: nD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC5467nD {

    /* JADX INFO: renamed from: nD$a */
    public static final class a implements InterfaceC5467nD {

        @NotNull
        public static final a a = new a();

        @Override // defpackage.InterfaceC5467nD
        @NotNull
        public final String a(@NotNull InterfaceC5044lD classifier, @NotNull C2964bZ renderer) {
            Intrinsics.checkNotNullParameter(classifier, "classifier");
            Intrinsics.checkNotNullParameter(renderer, "renderer");
            if (classifier instanceof H62) {
                C5638o21 name = ((H62) classifier).getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                return renderer.P(name, false);
            }
            C1836Qh0 c1836Qh0G = C4432iZ.g(classifier);
            Intrinsics.checkNotNullExpressionValue(c1836Qh0G, "getFqName(...)");
            return renderer.H(c1836Qh0G);
        }
    }

    /* JADX INFO: renamed from: nD$b */
    public static final class b implements InterfaceC5467nD {

        @NotNull
        public static final b a = new b();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, lD] */
        /* JADX WARN: Type inference failed for: r2v1, types: [jU] */
        /* JADX WARN: Type inference failed for: r2v2, types: [jU] */
        @Override // defpackage.InterfaceC5467nD
        @NotNull
        public final String a(@NotNull InterfaceC5044lD classifier, @NotNull C2964bZ renderer) {
            Intrinsics.checkNotNullParameter(classifier, "classifier");
            Intrinsics.checkNotNullParameter(renderer, "renderer");
            if (classifier instanceof H62) {
                C5638o21 name = ((H62) classifier).getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                return renderer.P(name, false);
            }
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(classifier.getName());
                classifier = classifier.e();
            } while (classifier instanceof FC);
            Intrinsics.checkNotNullParameter(arrayList, "<this>");
            return Cm2.l(new C3251cu1(arrayList));
        }
    }

    /* JADX INFO: renamed from: nD$c */
    public static final class c implements InterfaceC5467nD {

        @NotNull
        public static final c a = new c();

        public static String b(InterfaceC5044lD interfaceC5044lD) {
            String strL;
            C5638o21 name = interfaceC5044lD.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            String strK = Cm2.k(name);
            if (interfaceC5044lD instanceof H62) {
                return strK;
            }
            InterfaceC4675jU interfaceC4675jUE = interfaceC5044lD.e();
            Intrinsics.checkNotNullExpressionValue(interfaceC4675jUE, "getContainingDeclaration(...)");
            if (interfaceC4675jUE instanceof FC) {
                strL = b((InterfaceC5044lD) interfaceC4675jUE);
            } else if (interfaceC4675jUE instanceof InterfaceC2392Xa1) {
                C1836Qh0 c1836Qh0I = ((InterfaceC2392Xa1) interfaceC4675jUE).c().i();
                Intrinsics.checkNotNullExpressionValue(c1836Qh0I, "toUnsafe(...)");
                Intrinsics.checkNotNullParameter(c1836Qh0I, "<this>");
                List<C5638o21> listE = c1836Qh0I.e();
                Intrinsics.checkNotNullExpressionValue(listE, "pathSegments(...)");
                strL = Cm2.l(listE);
            } else {
                strL = null;
            }
            if (strL == null || strL.equals("")) {
                return strK;
            }
            return strL + JwtParser.SEPARATOR_CHAR + strK;
        }

        @Override // defpackage.InterfaceC5467nD
        @NotNull
        public final String a(@NotNull InterfaceC5044lD classifier, @NotNull C2964bZ renderer) {
            Intrinsics.checkNotNullParameter(classifier, "classifier");
            Intrinsics.checkNotNullParameter(renderer, "renderer");
            return b(classifier);
        }
    }

    @NotNull
    String a(@NotNull InterfaceC5044lD interfaceC5044lD, @NotNull C2964bZ c2964bZ);
}
