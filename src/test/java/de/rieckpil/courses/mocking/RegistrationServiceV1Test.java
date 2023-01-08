package de.rieckpil.courses.mocking;

import de.rieckpil.courses.BannedUsersClient;
import de.rieckpil.courses.JpaUserRepository;
import de.rieckpil.courses.RegistrationService;
import de.rieckpil.courses.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class RegistrationServiceV1Test {

  private UserRepository userRepository = Mockito.mock(UserRepository.class);
  private BannedUsersClient bannedUsersClient = Mockito.mock(BannedUsersClient.class);
  private RegistrationService cut = new RegistrationService(userRepository, bannedUsersClient);

  @Test
  void shouldRegisterUnknownUser() {

    UserRepository realRepository = new JpaUserRepository();

    System.out.println(realRepository.toString());
    System.out.println(userRepository.toString());
    System.out.println(userRepository.getClass());
    System.out.println(bannedUsersClient.toString());
    System.out.println(bannedUsersClient.getClass());


  }

}
