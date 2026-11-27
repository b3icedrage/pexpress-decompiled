package defpackage;

import com.jivosite.sdk.model.pojo.CustomData;
import com.jivosite.sdk.support.builders.ContactInfo;
import java.util.List;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface TA {
    void a(@NotNull String str);

    @Nullable
    Object b(@NotNull EnumC2694aJ1 enumC2694aJ1, @Nullable Object obj, @NotNull JM<? super Unit> jm);

    @NotNull
    InterfaceC6396rf0<List<CustomData>> c();

    @NotNull
    InterfaceC6396rf0<ContactInfo> d();

    void setId(@NotNull String str);
}
