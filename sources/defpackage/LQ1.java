package defpackage;

import java.util.List;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface LQ1 {

    public enum a {
        LAST_EVENT_ID("last_event_id"),
        PREVIOUS_SESSION_ID("previous_session_id"),
        LAST_EVENT_TIME("last_event_time"),
        OPT_OUT("opt_out"),
        Events("events"),
        APP_VERSION("app_version"),
        APP_BUILD("app_build");


        @NotNull
        public final String d;

        a(String str) {
            this.d = str;
        }
    }

    @NotNull
    List<Object> a();

    @Nullable
    Object b(@NotNull JM jm, @NotNull Object obj);

    @Nullable
    Object d(@NotNull LM lm);

    @Nullable
    Object e(@NotNull C0612Aq c0612Aq, @NotNull LM lm);

    @Nullable
    String f(@NotNull a aVar);

    @NotNull
    InterfaceC1403Kt1 g(@NotNull K80 k80, @NotNull MI mi, @NotNull EM em, @NotNull Y90 y90);

    @Nullable
    Unit h(@NotNull a aVar, @NotNull String str);
}
