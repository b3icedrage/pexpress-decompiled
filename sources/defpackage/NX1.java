package defpackage;

import io.jsonwebtoken.JwtParser;
import java.lang.reflect.Type;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class NX1 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Type type = (Type) obj;
        Intrinsics.checkNotNull(type);
        if (type instanceof Class) {
            return ((Class) type).getSimpleName();
        }
        String string = type.toString();
        return StringsKt.W(JwtParser.SEPARATOR_CHAR, string, string);
    }
}
